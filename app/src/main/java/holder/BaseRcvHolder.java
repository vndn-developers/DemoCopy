package holder;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;


import butterknife.ButterKnife;

public abstract class BaseRcvHolder extends ViewHolder
      {
    public BaseRcvHolder(View paramView) {
        super(paramView);
        ButterKnife.bind(this, paramView);
    }
}