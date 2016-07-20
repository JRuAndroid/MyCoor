package activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;


import com.jru.mycoor.R;

/**
 * Created by 陈丹丰 on 2016/7/17.
 */
public class FabActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        inint();

}

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    private void inint() {

        View viewById = findViewById(R.id.appBar);
        viewById.setOverScrollMode(33);

    }
}
