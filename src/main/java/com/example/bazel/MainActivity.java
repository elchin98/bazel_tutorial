package com.example.bazel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
//import timber.log.Timber;

/**
 * Main class for the Bazel Android "Hello, World" app.
 */
public class MainActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.v("Bazel", "Hello, Android");

//    Timber.e("");

    setContentView(R.layout.activity_main);

    Button clickMeButton = findViewById(R.id.clickMeButton);
    TextView helloBazelTextView = findViewById(R.id.helloBazelTextView);

    Greeter greeter = new Greeter();

    // Bazel supports Java 8 language features like lambdas!
    clickMeButton.setOnClickListener(v -> helloBazelTextView.setText(greeter.sayHello()));
  }
}
