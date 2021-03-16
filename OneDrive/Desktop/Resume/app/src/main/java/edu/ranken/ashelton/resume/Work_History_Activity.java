package edu.ranken.ashelton.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;


public class Work_History_Activity extends AppCompatActivity {
    final String WORKINFO = "\n" +
            "    Ranken Technical College\t\t\tWentzville, MO\n" +
            "    Student Tutor\t\tOctober 2020-Present\n" +
            "•\tAssisting fellow students with programming questions\n" +
            "\n" +
            "    Homeschool Teacher\t\t\tWentzville, MO\n" +
            "    August 2004-Present\n" +
            "•\tK-12 for my 3 children\n" +
            "\n" +
            "    House to Home Properties\t\t\tWentzville, MO\n" +
            "    Residential Housing Owner/Manager\n" +
            "    September 2010-Present\n" +

            "•\tTenant screening and selection\n" +
            "•\tResponsible for authorizing and coordinating repairs\n" +
            "•\tFinancial responsibilities related to property\n" +
            "\n" +
            "    Hy-Vee Grocery Store\t\t\tKansas City, MO\n" +
            "    Personal Shopper\t\t\tMarch 2019-July 2019\n" +
            "•\tCustomer Service\n" +
            "•\tOrder fulfillment, processing payment and delivery\n" +
            "•\tStocking merchandise & assisting other departments as needed\n" +
            "\n" +
            "    Wentzville United Methodist Church\t\t\tWentzville, MO\n" +
            "    Finance & Membership Secretary\t\t\tJuly 2016-July 2018\n" +
            "•\tRecorded/Updated Congregational Financial Contributions\n" +
            "•\tRecorded/Updated Congregational Data\n" +
            "•\tPrepared Weekly, Monthly, & Annual Reports" +
            "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work__history_);

        TextView tvWorkHistoryInfo = findViewById(R.id.tvWorkHistoryInfo);
        tvWorkHistoryInfo.setText(WORKINFO);
        tvWorkHistoryInfo.setMovementMethod(new ScrollingMovementMethod());
    }

    public void onClickGoToMainActivity(View view) {
        Intent m = new Intent(this, MainActivity.class);
        startActivity(m);
    }


}