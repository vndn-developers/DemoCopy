package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import holder.BookHolder;
import model.User;

public class BookListAdapter extends RecyclerView.Adapter<BookHolder>{
    ArrayList<User> arrayList=null;
    String url;
    String title;
    String author;
    String rating;
    String cost;
    int postion=0;
    public BookListAdapter(ArrayList<User> arrayList){
        this.arrayList=arrayList;

    }public BookListAdapter(){}
    public int getItemCount() {
        return arrayList!=null?arrayList.size():8;
    }

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }

    public void onBindViewHolder(BookHolder paramBookHolder, int paramInt) {
        postion=paramInt;
        postion++;
    }

    public BookHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt) {
        if (arrayList!=null){
            User modeMyBooks=arrayList.get(postion);
            title=modeMyBooks.getName();
            url=modeMyBooks.getThumbnail();
            author=modeMyBooks.getLocation();
        }
        return arrayList!=null?new BookHolder(new BookItemView(paramViewGroup.getContext(),arrayList,url,title,author,rating,cost)):new BookHolder(new BookItemView(paramViewGroup.getContext()));
    }

}