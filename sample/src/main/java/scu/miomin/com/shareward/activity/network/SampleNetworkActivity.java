package scu.miomin.com.shareward.activity.network;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import scu.miomin.com.shareward.R;
import scu.miomin.com.shareward.constants.ActivityType;
import scu.miomin.com.shareward.toolbar.ToolbarActivity;

/**
 * Launches the different samples
 */
public class SampleNetworkActivity extends ToolbarActivity implements View.OnClickListener {

    private Button mJSONObjectSample, mJSONArraySample;

    @Override
    protected void getContentView() {
        setContentView(R.layout.activity_network, ActivityType.MODE_TOOLBAR_BACK);
    }

    @Override
    protected void setUpView() {
        mJSONObjectSample = (Button) findViewById(R.id.json_object);
        mJSONArraySample = (Button) findViewById(R.id.json_array);
        mJSONObjectSample.setOnClickListener(this);
        mJSONArraySample.setOnClickListener(this);
    }

    @Override
    protected void setUpData(Bundle savedInstanceState) {

    }

    @Override
    public void onClick(View view) {
        if (view == mJSONObjectSample) {
            startActivity(new Intent(this, SampleJSONObjectActivity.class));
        } else if (view == mJSONArraySample) {
            startActivity(new Intent(this, SampleJSONArrayActivity.class));
        }
    }
}
