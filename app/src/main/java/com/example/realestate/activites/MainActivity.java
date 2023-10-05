package com.example.realestate.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.realestate.Adapter.itemsAdapter;
import com.example.realestate.Models.itemModels;
import com.example.realestate.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular,adapterNew;
    private RecyclerView recyclerViewPopular, recyclerViewNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }
    private void initRecyclerView() {
        ArrayList<itemModels> items = new ArrayList<>();
        items.add(new itemModels("بيت مسلح دورين","Yemen-Sana'a",
                "منزل دوورين يتميز بجماله الفريد وتصميمه الأنيق. يقع هذا العقار في منطقة هادئة ومطلة على المناظر الطبيعية الخلابة. يتميز الواجهة الخارجية للمنزل بأسلوبه الكلاسيكي الرائع والألوان الهادئة التي تعزز من جاذبيته.\n عند دخولك إلى المنزل، ستجد نفسك في غرفة استقبال فسيحة تمتاز بإضاءة طبيعية وفساتين أرضية من الخشب الفاخر. تمتاز صالة المعيشة بتصميم مفتوح يتيح للضيوف التجول بحرية، وتوفير إطلالات رائعة على الحديقة الخلفية من خلال النوافذ الكبيرة.\nتحتوي المطبخ الممتاز على أجهزة منزلية حديثة ومساحة وفيرة للتحضير وتناول الوجبات. يتميز المنزل أيضًا بغرفة طعام مريحة تتسع للعائلة والأصدقاء.\nالدور الثاني يضم ثلاث غرف نوم فسيحة، بما في ذلك غرفة نوم رئيسية تحتوي على حمام خاص ومشمس بشكل طبيعي. تمتاز الغرف بالأرضيات الخشبية والأثاث الأنيق.\n"
                ,
                2,
                3,
                200000000,
                "pic2",
                true));
        items.add(new itemModels("فله للبيع","Yemen-Sana'a",
                "منزل دوورين يتميز بجماله الفريد وتصميمه الأنيق. يقع هذا العقار في منطقة هادئة ومطلة على المناظر الطبيعية الخلابة. يتميز الواجهة الخارجية للمنزل بأسلوبه الكلاسيكي الرائع والألوان الهادئة التي تعزز من جاذبيته.\n عند دخولك إلى المنزل، ستجد نفسك في غرفة استقبال فسيحة تمتاز بإضاءة طبيعية وفساتين أرضية من الخشب الفاخر. تمتاز صالة المعيشة بتصميم مفتوح يتيح للضيوف التجول بحرية، وتوفير إطلالات رائعة على الحديقة الخلفية من خلال النوافذ الكبيرة.\nتحتوي المطبخ الممتاز على أجهزة منزلية حديثة ومساحة وفيرة للتحضير وتناول الوجبات. يتميز المنزل أيضًا بغرفة طعام مريحة تتسع للعائلة والأصدقاء.\nالدور الثاني يضم ثلاث غرف نوم فسيحة، بما في ذلك غرفة نوم رئيسية تحتوي على حمام خاص ومشمس بشكل طبيعي. تمتاز الغرف بالأرضيات الخشبية والأثاث الأنيق."
                ,2,3,20000000,"pic1",true));
        items.add(new itemModels("عمارة للايجار","Yemen-Sana'a",
                "منزل دوورين يتميز بجماله الفريد وتصميمه الأنيق. يقع هذا العقار في منطقة هادئة ومطلة على المناظر الطبيعية الخلابة. يتميز الواجهة الخارجية للمنزل بأسلوبه الكلاسيكي الرائع والألوان الهادئة التي تعزز من جاذبيته.\n عند دخولك إلى المنزل، ستجد نفسك في غرفة استقبال فسيحة تمتاز بإضاءة طبيعية وفساتين أرضية من الخشب الفاخر. تمتاز صالة المعيشة بتصميم مفتوح يتيح للضيوف التجول بحرية، وتوفير إطلالات رائعة على الحديقة الخلفية من خلال النوافذ الكبيرة.\nتحتوي المطبخ الممتاز على أجهزة منزلية حديثة ومساحة وفيرة للتحضير وتناول الوجبات. يتميز المنزل أيضًا بغرفة طعام مريحة تتسع للعائلة والأصدقاء.\nالدور الثاني يضم ثلاث غرف نوم فسيحة، بما في ذلك غرفة نوم رئيسية تحتوي على حمام خاص ومشمس بشكل طبيعي. تمتاز الغرف بالأرضيات الخشبية والأثاث الأنيق.\nالحديقة الخلفية تقدم منطقة استجمام مثالية مع شرفة واسعة ومساحة خضراء جميلة. هذا المنزل الدوورين هو مكان رائع للاسترخاء والعيش براحة وفخر."
                ,
                2,
                3,
                200000000,
                "pic2",
                true));
        items.add(new itemModels("مكتب للايجار","Yemen-Sana'a",
                "منزل دوورين يتميز بجماله الفريد وتصميمه الأنيق. يقع هذا العقار في منطقة هادئة ومطلة على المناظر الطبيعية الخلابة. يتميز الواجهة الخارجية للمنزل بأسلوبه الكلاسيكي الرائع والألوان الهادئة التي تعزز من جاذبيته.\n عند دخولك إلى المنزل، ستجد نفسك في غرفة استقبال فسيحة تمتاز بإضاءة طبيعية وفساتين أرضية من الخشب الفاخر. تمتاز صالة المعيشة بتصميم مفتوح يتيح للضيوف التجول بحرية، وتوفير إطلالات رائعة على الحديقة الخلفية من خلال النوافذ الكبيرة.\nتحتوي المطبخ الممتاز على أجهزة منزلية حديثة ومساحة وفيرة للتحضير وتناول الوجبات. يتميز المنزل أيضًا بغرفة طعام مريحة تتسع للعائلة والأصدقاء.\nالدور الثاني يضم ثلاث غرف نوم فسيحة، بما في ذلك غرفة نوم رئيسية تحتوي على حمام خاص ومشمس بشكل طبيعي. تمتاز الغرف بالأرضيات الخشبية والأثاث الأنيق.\n"
                ,2,3,20000000,"pic1",true));


        recyclerViewPopular= findViewById(R.id.viewPopular);
        recyclerViewNew = findViewById(R.id.viewNew);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        adapterNew = new itemsAdapter(items);
        adapterPopular = new itemsAdapter(items);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);

    }
}