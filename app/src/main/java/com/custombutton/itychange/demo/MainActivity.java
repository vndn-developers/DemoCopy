package com.custombutton.itychange.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

import Network.ApiInterface;
import Network.GetApi;
import adapter.BookListAdapter;
import butterknife.ButterKnife;
import model.Objects;
import model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMyBooks;
    BookListAdapter adapter;
    RecyclerView rcvBook;
    private ArrayList<User> myBookses = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        rcvBook= (RecyclerView) findViewById(R.id.recycler_view);
        rcvBook.setLayoutManager(new GridLayoutManager(this, 3));
        EventBus.getDefault().register(this);
        getInformation();
    }
    public void getInformation(){
        ApiInterface apiService = GetApi.getClient().create(ApiInterface.class);
        Call call= apiService.getInforMation();
        call.enqueue(new Callback<Objects>() {
            @Override
            public void onResponse(Call<Objects> call, Response<Objects> response) {
                myBookses=response.body().getMyBookses();
                adapter=new BookListAdapter(myBookses);
                rcvBook.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<Objects> call, Throwable t) {

            }
        });
    }



    @Subscribe
    public void onEvent(String  event){
        Toast.makeText(MainActivity.this, "event:"+event, Toast.LENGTH_SHORT).show();
    }
    @Subscribe
    public void onEventW(String  url){
        Toast.makeText(MainActivity.this, "url:"+url, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
