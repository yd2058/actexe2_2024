package com.example.actexe2_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    String[] regions = {"Pick your Mainland","Europe","Asia","Africa","North America","South America","Oceania"},emp={};
    String[][][] dict={{{"Finland","Denmark","Norway","Sweden","Iceland","Faroe Islands","Germany"},{"Helsinki","Copenhagen","Oslo","Stockholm","Reykjavik","Tórshavn","Berlin"},{"5.6mil","5.9mil","5.5mil","10.5mil","380k","54k","83.3mil"},{"Finnish","Danish","Norwegian","Swedish","Icelandic","Faroese","German"},{"Maamme","Der er et yndigt land","Ja, vi elsker dette landet","Du gamla, du fria","Ó, guð vors lands","Tú alfagra land mítt","Deutschlandlied"}},
                {{"Sri Lanka","Brunei","Bhutan","Cyprus","Bangladesh","Armenia","Bahrain"},{"Colombo","Bandar Seri Begawan","Thimphu","Nicosia","Dhaka","Yerevan","Manama"},{"22mil","460k","727k","1.2mil","169.4mil","2.7mil","1.8mil"},{"Sinhala","Malay","Dzongkha","Greek","Bengali","Armenian","Arabic"},{"Sri Lanka Matha","Allah Peliharakan Sultan","Druk Tsenden","Hymn to Liberty","Amar Sonar Bangla","Mer Hayrenik","Bahrainona"}},
                {{"Ceuta","Cape Verde","Gabon","Chad","malawi","Eritrea","Comoros"},{"N/A","Paria","Liberville","N'Djamena","Lilongwe","Asmara","Moroni"},{"84.8k","588k","2.3mil","17.2mil","19.9mil","3.6mil","821.6k"},{"Spanish","Portuguese","French","French","English","Tigrinya","Comorian"},{"Himno de Ceuta","Cântico da Liberdade","La Concorde","La Tchadienne","Mlungu dalitsani Malaŵi","Eritrea, Eritrea, Eritrea","Udzima wa ya Masiwa"}},
                {{"Curaçao","Belize","Saba","Saint Vincent And The Grenadines","Nueva Esparta","El Salvador", "Cuba"},{"Willemstad","Belmopan","The Bottom","Kingstown","La Asunción","San Salvador","Havana"},{"152.3k","400k","1.9k","104.3k","491k","6.3k","11.3mil"},{"Papiamento","English","Dutch","English","Spanish","Spanish","Spanish"},{"Himno di Kòrsou","Land Of The Free","Saba, you rise from the ocean","Saint Vincent, Land so Beautiful","Himno del Estado Nueva Esparta","Himno Nacional de El Salvado","El Himno de Bayamo"}},
                {{"Ecuador","Guyana","Paraguay","Bolivia","Suriname","Falkland Islands","South Georgia and the South Sandwich Islands"},{"Quito","Georgetown","Asunción","La Paz","Paramaribo","Stanley","Kng Edward Point"},{"17.8mil","804.5k","6.7mil","12mil","613k","2.8k","30"},{"Spanish","English","Paraguayan Guarani","Spanish","Dutch","English","English"},{"¡Salve, Oh Patria!","Green Land of Guyana","Tetã Paraguái Momorãhéi","Bolivianos, el Hado Propicio","God zij met ons Suriname","God Save the King","God Save the King"}},
                {{"Tuvalu","Kiribati","Nauru","Solomon Islands"," Vanuatu","Niue","Tonga"},{"Funafuti","Tarawa","Yaren","Honiara","Port Vila","Alofi","Nuku'alofa"},{"11k","128k","12.5k","707.8k","319k","2k","106k"},{"Tuvaluan","English","Nauruan","English","Bislama","English","tongan"},{"Tuvalu mo te Atua","Kunan Kiribati","Nauru Bwiema","God Save Our Solomon Islands","Yumi, Yumi, Yumi","Ko e Iki he Lagi","Ko e fasi ʻo e tuʻi ʻo e ʻOtu Tonga"}}};
    Spinner region;
    ListView count;
    TextView tvcap, tvpop, tvlang, tvant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        region = (Spinner)findViewById(R.id.region);

        region.setOnItemSelectedListener(this);
        ArrayAdapter<String> regadp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, regions);
        region.setAdapter(regadp);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}