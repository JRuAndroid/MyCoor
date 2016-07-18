package activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.ImageView;

import com.jru.mycoor.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by 陈丹丰 on 2016/7/17.
 */
public class FabActivity extends Activity {
    @InjectView(R.id.iv)
    ImageView iv;
    @InjectView(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        ButterKnife.inject(this);
fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Snackbar.make(iv, "hello Snackbar", Snackbar.LENGTH_SHORT).show();
    }
});
    }
}
