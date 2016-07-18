package activity;

import android.app.Activity;
import android.os.Bundle;

import com.jru.mycoor.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 陈丹丰 on 2016/7/17.
 */
public class ColActivity extends Activity {


    @InjectView(R.id.toolBar)
    android.support.v7.widget.Toolbar toolBar;
    @InjectView(R.id.coll_toolbar)
    android.support.design.widget.CollapsingToolbarLayout collToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_col);
        ButterKnife.inject(this);

        collToolbar.setTitle("hello Coll");

    }
}
