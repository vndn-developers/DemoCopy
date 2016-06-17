package adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.custombutton.itychange.demo.R;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import model.User;

public class BookItemView extends LinearLayout {

    @Bind(R.id.tvBookId)
    public TextView tvBookId;
    @Bind(R.id.imvThumb)
    public ImageView imvThumb;
    @Bind(R.id.tvTitleBook)
    public TextView tvTitleBook;
    @Bind(R.id.tvAuthor)
    public TextView tvAuthor;
    @Bind(R.id.rbRating)
    public RatingBar rbRating;
    @Bind(R.id.tvCost)
    public TextView tvCost;
    @Bind(R.id.btnDaMua)
    public Button btnDaMua;
    @Bind(R.id.numrating)
    public TextView numrating;



    String url;
    String title;
    String author;
    String rating;
    String cost;
    public ArrayList<User> arrayList=null;
    public BookItemView(Context paramContext) {
        super(paramContext);
        init();
    }
    public BookItemView(Context paramContext, ArrayList<User>arrayList, String url, String title, String author, String rating, String cost) {
        super(paramContext);
        this.arrayList=arrayList;
        this.url=url;
        this.title=title;
        this.author=author;
        this.rating=rating;
        this.cost=cost;
        init();
    }
    public BookItemView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        init();
    }

    public BookItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
        init();
    }

    private void init() {
        View view=LayoutInflater.from(getContext()).inflate(R.layout.customlayout, this, true);
        imvThumb= (ImageView) view.findViewById(R.id.imvThumb);
        tvTitleBook= (TextView) view.findViewById(R.id.tvTitleBook);
        tvAuthor= (TextView) view.findViewById(R.id.tvAuthor);
        tvCost= (TextView) view.findViewById(R.id.tvCost);
        rbRating= (RatingBar) view.findViewById(R.id.rbRating);
        numrating= (TextView) view.findViewById(R.id.numrating);
        if(arrayList!=null){
            Glide.with(getContext())
                    .load(url)
                    .centerCrop()
                    .crossFade()
                    .into(imvThumb);
            tvTitleBook.setText(title);
            tvAuthor.setText(author);
            if(rating!=null) {
                rbRating.setRating(Float.parseFloat(rating));
            }
            else {
                rbRating.setRating(0);
            }
            tvCost.setText(cost);

        }
        ButterKnife.bind(this);
    }

    public String getBookId() {
        return this.tvBookId.getText().toString();
    }

    @OnClick({R.id.tvTitleBook,R.id.imvThumb})
    public void onBookClick(View paramView) {
        switch(paramView.getId()){
            case R.id.tvTitleBook:
                EventBus.getDefault().post(tvTitleBook.getText());
                break;
            case R.id.imvThumb:
                EventBus.getDefault().post(url);

                break;
        }
    }
}