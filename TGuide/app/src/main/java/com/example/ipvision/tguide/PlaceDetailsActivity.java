package com.example.ipvision.tguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailsActivity extends AppCompatActivity {

    TextView name = null;
    TextView introduction=null;
    TextView howToGo=null;
    TextView placesToVisit=null;
    ImageView coverImage=null;
    Places place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_details);
        Intent i = getIntent();
        place = (Places) i.getSerializableExtra("placeObject");
        intiUI();
    }

    private void intiUI(){
        introduction = (TextView) findViewById(R.id.intro);
        howToGo = (TextView) findViewById(R.id.how_to_go);
        placesToVisit = (TextView) findViewById(R.id.places_to_visit);
        coverImage = (ImageView) findViewById(R.id.cover_image);

        //introduction.setMovementMethod(new ScrollingMovementMethod());
        introduction.setText("সাজেক রাংগামাটি জেলার বাঘাইছড়ি উপজেলার একটি ইউনিয়ন। বাংলাদেশের সবচেয়ে বড় ইউনিয়ন সাজেক আয়তনে বিশাল, বাংলাদেশের অনেক উপজেলার চেয়েও আয়তনে বড়। এটির অবস্থান খাগড়াছড়ি জেলা থেকে উত্তর-পুর্ব দিকে। মুল সাজেক বলতে যে স্থানকে বুঝায় সেটি হলো ‘রুইলুই’ এবং ‘কংলাক’ নামের দুটি বসতি, স্থানীয় ভাষায় ’পাড়া’। সমুদ্রপৃষ্ঠ থেকে এর উচ্চতা ১৮০০ ফুট।সাজেকে মূলত লুসাই,পাংখোয়া এবং ত্রিপুরা আদিবাসী বসবাস করে।সাজেক থেকে ভারতের মিজোরাম সীমান্তের দুরত্ব ১০ কি.মি.।কমলা চাষের জন্য বিখ্যাত সাজেক। \n" +
                "\n" +
                "সাজেক এমন একটি জায়গা যেখানে ভাগ্য ভাল হলে ২৪ ঘণ্টায় আপনি প্রকৃতির তিনটা রূপই দেখতে পারবেন । কখনো খুবই গরম একটু পরেই হটাৎ বৃষ্টি এবং তার কিছু পরেই হয়তো চারদিকে ঢেকে যাবে কুয়াশার চাদরে । রাতে এই দুর্গম পাহাড়ের চুড়ায় যখন সোলারের কল্যাণে বাতি জ্বলে উঠে তখন সৃষ্টি হয় অসাধারণ এক পরিস্থিতি । অনেক বাচ্চারা রোড লাইটের নিচে বই নিয়ে বসে পড়ে অথবা ঐ টুকু আলোর ভিতরেই খেলায় মেতে উঠে । সাজেকে ৩টা হ্যালি প্যাড আছে ৩টার সৌন্দর্য তিন রকম । এছাড়া রুইলুই পারা হতে হেটে আপনি কমলং পারা পর্যন্ত যেতে পারেন এই পারাটিও অনেক সুন্দর এবং অনেক উচুতে অবস্থিত । কমলার সিজনে কমলা খেতে ভুলবেন না । সাজেকের কমলা বাংলাদেশের সেরা কমলা । বাংলাদেশ আর্মিদের দারা রুইলুই পারার অধিবাসীদের জন্য একটা ছোট তাত শিল্প গরে তোলা হয়েছে । সুন্দর সুন্দর গামছা ,লুঙ্গী পাওয়া এখানে।");
        howToGo.setText(place.getHowToGo());
        placesToVisit.setText(place.getPlacesToVisit());
        coverImage.setImageResource(place.getImage());

    }
}
