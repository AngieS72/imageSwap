package edu.ranken.ashelton.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Education_Activity extends AppCompatActivity {
    final String EDINFO = "Ranken Technical College, 1/2020 - 12/2021:\n" +
            "Associates of Technology Degree\n" +
            "Application Web Development Program (AWD):\n\n" +
            "AWD 1000: Web Development Technologies:\n" +
            "(14 cr hrs)\n" +
            "Hands-on experience and real-world projects in HTML,\n" +
            "CSS, & JavaScript.  Introduction to and covering of\n" +
            "current content management systems, accessibility\n" +
            "concepts, web ethics, e-commerce, search engine\n" +
            "optimization, and mobile website technologies.\n\n" +
            "AWD 1100:  Programming Fundamentals with C#: \n" +
            "(14 credit hours)\n" +
            "Intro to writing programs that demonstrate the C#\n" +
            "and object-oriented programming (OOP). This class\n" +
            "develops programming concepts and logic focused\n" +
            "on problem solving skills that translate into \n" +
            "real-world applications.  Debugging skills are \n" +
            "demonstrated and used here also.\n\n" +
            "AWD 1111:  .NET Framework with Web Databases:\n" +
            "(14 credit hours)\n" +
            "This course begins by using the ASP.NET and C#\n" +
            "programming languages within that framework.\n" +
            " Emphasis will be given to the .NET architecture\n" +
            "and design, data access, deployment and distribution.\n" +
            " Students will also learn how to create \n" +
            "database-driven websites, implementing the latest\n" +
            "technologies to integrate databases within Web \n" +
            "applications. Students will be able to add databases\n" +
            "to their .NET applications, manipulate data using \n" +
            "SQL operations, and publish both static and dynamic\n" +
            "data on the Web.\n\n" +
            "AWD1112:  Application Programming with Java:\n" +
            "(14 credit hours)\n" +
            "Introduction to the Java programming language.\n" +
            "Students will be able to write programs that\n" +
            "demonstrate object-orient concepts. This course\n" +
            "will widen the student's understanding of \n" +
            "programming concepts, as well as introduce more\n" +
            "planning and design concepts. Android Studio will\n" +
            "be used in the second half of the course to develop\n" +
            "an Android application. Using current software\n" +
            "development kits, distributed version control\n" +
            "systems, and APIs, students will get well-rounded,\n" +
            "hands-on experience that will translate into the\n" +
            "skills they will need to be successful.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_);

        TextView tvEducationInfo = findViewById(R.id.tvEducationInfo);
        tvEducationInfo.setText(EDINFO);
        tvEducationInfo.setMovementMethod(new ScrollingMovementMethod());
    }

    public void onClickGoToMainActivity(View view) {
        Intent m = new Intent(this, MainActivity.class);
        startActivity(m);
    }


}