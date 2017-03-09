package com.example.harikachowdary.g_me;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class hangout extends ActionBarActivity
{
    private Toast mToastToShow;
    int toastDurationInMilliSeconds = 10000;

        EditText editsearch;
        ListView listView;
        private ArrayList<String> mItems;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hangout);

            editsearch = (EditText)findViewById(R.id.editText1);
            listView = (ListView)findViewById(R.id.listView1);

            mItems = new ArrayList<String>();
            mItems.add("Abids");
            mItems.add("Alwal");
            mItems.add("Ameerpet");
            mItems.add("Anandbagh");
            mItems.add("A S Roa Nagar");
            mItems.add("Attapur");
            mItems.add("Bachupally");
            mItems.add("Banjara Hills");
            mItems.add("Barkatpura");
            mItems.add("Basheerbagh");
            mItems.add("Begumpet");
            mItems.add("Bowenpally");
            mItems.add("Charminar");
            mItems.add("Cyberabad");
            mItems.add("DSNR");
            mItems.add("ECIL");
            mItems.add("Film Nagar");
            mItems.add("Gachibowli");
            mItems.add("Gandhi Nagar");
            mItems.add("Gandipet");
            mItems.add("Ghatkesar");
            mItems.add("Golconda");
            mItems.add("Habsiguda");
            mItems.add("Hayathnagar");
            mItems.add("Himayath nagar");
            mItems.add("Hi Tech City");
            mItems.add("Jubilee Hills");
            mItems.add("Kachiguda");
            mItems.add("Khairatabad");
            mItems.add("Koti");
            mItems.add("Kompally");
            mItems.add("Kondapur");
            mItems.add("Kothapet");
            mItems.add("KPHB");
            mItems.add("Kukatpally");
            mItems.add("L B Nagar");
            mItems.add("Lakdikapul");
            mItems.add("Madhapur");
            mItems.add("Malakpet");
            mItems.add("Malkajgiri");
            mItems.add("Mallapur");
            mItems.add("Manikonda");
            mItems.add("Marredpally");
            mItems.add("Masab Tank");
            mItems.add("Mehdipatnam");
            mItems.add("Mettuguda");
            mItems.add("Miyapur");
            mItems.add("Nallakunta");
            mItems.add("Narayanaguda");
            mItems.add("Necklace Road");
            mItems.add("Nizampet");
            mItems.add("Panjagutta");
            mItems.add("Safilguda");
            mItems.add("Sainikpuri");
            mItems.add("Secunderabad");
            mItems.add("Shaikpet");
            mItems.add("Shamirpet");
            mItems.add("Shamshabad");
            mItems.add("Somajiguda");
            mItems.add("Srinagar Colony");
            mItems.add("Tank Bund");
            mItems.add("Tarnaka");
            mItems.add("Tolichowki");
            mItems.add("Uppal");



            listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mItems));


            listView.setAdapter(new ArrayAdapter<String>(hangout.this, android.R.layout.simple_list_item_1, android.R.id.text1,mItems));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> arg0, View arg70, int position, long arg10) {

                                                    switch (position) {
                                                        case 0:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* NAVRANG COFFE\n\n" +
                                                                    "* SANTOSH CINEMA HALL\n\n" +
                                                                    "* GRAND HOTEL\n\n" +
                                                                    "* SANALI MALL\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* MCDONALD'S\n\n" +
                                                                    "* CAFE BAHAR \n\n" +
                                                                    "* BLUE DIAMOND CHINESE RESTAURANT \n\n" +
                                                                    "* RAMAKRISHNA THEATER \n\n" +
                                                                    "* TAJ MAHAL HOTEL\n\n", Toast.LENGTH_LONG);
                                                           counttoast();


                                                            break;

                                                        case 1:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* COFFEE BEANZ" +
                                                                    "\n\n* LAXMIKALA MANDIR CINEMA HALL" +
                                                                    "\n\n* AAHAR RESTAURANT" +
                                                                    "\n\n* CAFÉ COFFEE DAY" +
                                                                    "\n\n* RAJI REDDY SHOPPING COMPLEX" +
                                                                    "\n\n* LAL BAWARCHI" +
                                                                    "\n\n* KOMAL HAIR DRESSERS" +
                                                                    "\n\n* ST. ANTHONY'S CHURCH" +
                                                                    "\n\n* AVR CYBER CAFE" +
                                                                    "\n\n* JANAKI NAGAR PARK" +
                                                                    "\n\n* RELIANCE FRESH", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;


                                                        case 2:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* MINERVA COFFEE SHOP\n\n" +
                                                                    "* BIG CINEMAS  \n\n" +
                                                                    "* SOUTH INDIA SHOPPING MALL\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n", Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;


                                                        case 3:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* GRILLS AND GRAVIES\n\n" +
                                                                    "* RAM CHANDRA CINEMA HALL\n\n" +
                                                                    "* JASMINE HOTEL\n\n" +
                                                                    "* SRI ANDAL MIXTURE AND TIFFINS\n\n" +
                                                                    "* RAGHAVENDRA THEATRE \n\n" +
                                                                    "* SHIVA TEMPLE \n\n" +
                                                                    "* MOHAN DHABA \n\n" +
                                                                    "* MYTHRI CAFE \n\n" +
                                                                    "* HOT PLATE\n\n" +
                                                                    "* BATA SHOW ROOM\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 4:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* RADHIKA MOVIE PLEX\n\n" +
                                                                    "* PARIVAAR\n\n" +
                                                                    "* THE COFFEE CUP\n\n" +
                                                                    "* CHENNAI SHOPPING MALL\n\n" +
                                                                    "* BOWL O' CHINA \n\n" +
                                                                    "* STYLE IN FURNITURES\n\n" +
                                                                    "* LEVI'S\n\n" +
                                                                    "* SIP AND BYTE BAKERY\n\n" +
                                                                    "* SAINIKPURI EAST PARK\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 5:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* OVEN SECRETS\n\n" +
                                                                    "* ASIAN CINEMAS\n\n" +
                                                                    "* K CAFÉ AND LOUNGE\n\n" +
                                                                    "* SWAGATH GRAND\n\n" +
                                                                    "* MCUBE MALL\n\n" +
                                                                    "* EESHWAR THEATRE \n\n" +
                                                                    "* WEST FACE \n\n" +
                                                                    "* HOTEL RIVERIA GRAND \n\n" +
                                                                    "* KRISH BEAUTY PARLOUR \n\n" +
                                                                    "* SPENCER'S HYPER MARKET\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 6:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* AROMA CUP RESTRO\n\n" +
                                                                    "* ROYAL FAMILY DHABA AND RESTAURANT\n\n" +
                                                                    "* KAVYA CURRIES ROTI & BIRYANI POINT\n\n" +
                                                                    "* BIG B FAMILY SHOWROOM \n\n" +
                                                                    "* VASTRAANI ONLINE SAREE PORTAL \n\n" +
                                                                    "* SAI DURGA HOTEL \n\n" +
                                                                    "* LAKSHMIKALA SUPER MARKET \n\n" +
                                                                    "* RAJU HAIR STYLS \n\n" +
                                                                    "* RK'S FINGER MUNCH \n\n" +
                                                                    "* SRI NEW BANGALORE IYANGAR'S BAKERY\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 7:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* MOCHA\n\n" +
                                                                    "*  PVR\n\n"+"* INOX \n\n" +
                                                                    "* OHRI’S  \n\n" +
                                                                    "* GVK MALL\n\n" +
                                                                    "* CAFÉ CUBANO\n\n" +
                                                                    "* RELIANCE DIGITAL\n\n" +
                                                                    "* THE OFEN\n\n" +
                                                                    "* THE YELLOW CHILLI\n\n" +
                                                                    "* JAVED HABIB HAIR & BEAUTY SALON\n\n" +
                                                                    "* THE MANDIR\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;


                                                        case 8:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* GAYATRI MULTIPLEX\n\n" +
                                                                    "* GRAND SWAGATH\n\n" +
                                                                    "* MAA GAYATRI PLAZA\n\n" +
                                                                    "* HOTEL METRO\n\n" +
                                                                    "* HOTEL ASHOKA KLAASIC \n\n" +
                                                                    "* RELIANCE FRESH \n\n" +
                                                                    "* STEP 'N' EAT BAKERS \n\n" +
                                                                    "* NEW SEA WORLD CAFE \n\n" +
                                                                    "* ADIDAS \n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 9:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* SWATHI COFFEE SHOP\n\n" +
                                                                    "* PRASAD’S MULTIPLEX\n\n" +
                                                                    "* OHRI’S\n\n" +
                                                                    "* THE RAYMOND SHOP\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* MCDONALD'S \n\n" +
                                                                    "* TAJ MAHAL HOTEL\n\n" +
                                                                    "* KFC \n\n" +
                                                                    "* GUFAA \n\n" +
                                                                    "* WESTSIDE \n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 11:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* KALYANI CINEMA HALL\n\n" +
                                                                    "* PAKWAAN\n\n" +
                                                                    "* GULF BAKERS\n\n" +
                                                                    "* GANSHYAM SUPER MARKET \n\n" +
                                                                    "* BATA SHOWROOM \n\n" +
                                                                    "* SEVEN TEMPLES \n\n" +
                                                                    "* NATIONAL POINT CAFE \n\n" +
                                                                    "* FASHION ZONE \n\n" +
                                                                    "* REEBOK-BOWENPALLY \n\n" +
                                                                    "* TAAZA\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 12:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* SHAH GHOUSE RESTAURANT\n\n" +
                                                                    "* LAAD BAZAR\n\n" +
                                                                    "* SHAH GHOUSE CAFE\n\n" +
                                                                    "* PISTA HOUSE \n\n" +
                                                                    "* VICTORIA FOOD COURT \n\n" +
                                                                    "* SILKY ICECREAM(SHAH GUNJ)\n\n" +
                                                                    "* VICTORIA RESTAURANT \n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 13:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"* PVR Inorbit Mall \n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                        break;

                                                        case  14:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Asian Shiva ganga theatre \n\n"+"* Mega theatre\n\n"+
                                                                        "* konark theatre \n\n"+" *Chandana Brothers  \n\n"+"* Adidas  \n\n"+
                                                                        " *Jeans Corner\n\n"+"* Taruni  \n\n"+"* RS brothers \n\n"+" *Swagath Restuarant\n\n"+"* Green Leaves Hotel\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                        break;

                                                        case 15:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* RADHIKA\n\n" +
                                                                    "* KBN GREEN BAWARCHI\n\n" +
                                                                    "* CHENNAI SHOPPING MALL\n\n" +
                                                                    "* CAKES AND COFFEE\n\n" +
                                                                    "* MC DONALDS\n\n" +
                                                                    "* DOMINOS\n\n" +
                                                                    "* KFC\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 16:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ MELANGE\n\n" +
                                                                    "* PRATHIMA MULTIPLEX\n\n" +
                                                                    "* SIMPLY SOUTH\n\n" +
                                                                    "* VALUE MART SUPERMARKET\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* MCDONALD'S\n\n" +
                                                                    "* BRAND FACTORY\n\n" +
                                                                    "* LEVI'S-JUBLIEE HILLS\n\n" +
                                                                    "* MOM & ME\n\n" +
                                                                    "* PATIO RESTAURANT \n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 17:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* BARISTA COFFEE SHOP,\n\n" +
                                                                    "* PVR CINEMAS,\n\n" +
                                                                    "* SIMPLY SOUTH res\n\n" +
                                                                    "* SLN TERMINUS MALL,\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* SUBWAY RESTAURANT\n\n" +
                                                                    "* MIRROR POOL\n\n" +
                                                                    "* BASKIN ROBBINS\n\n" +
                                                                    "* ICICI BANK\n\n" +
                                                                    "* MORE\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 18:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* SHIVA’S COFFEE BAR\n\n" +
                                                                    "* CINEMAX\n\n" +
                                                                    "* FORTUNE INN HAVELI\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 19:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* CAFÉ SANDWICHO\n\n" +
                                                                    "* KRISHNA PEARLS AND JEWELLERS\n\n" +
                                                                    "* OCEAN PARK \n\n" +
                                                                    "* TREASURE ISLAND RESORTS PVT LTD \n\n" +
                                                                    "* HANGOVER SPOT\n\n" +
                                                                    "* GANDIPET PARK \n\n" +
                                                                    "* AMUL FAST FOODS\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 20:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* BEAN COFFEE SHOP\n\n" +
                                                                    "* JAGADAMBA CINEMA\n\n" +
                                                                    "* PARIVAAR\n\n" +
                                                                    "* MY COFFEE SHOP\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 21:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* INNOVATIVE MULTIPLEX\n\n" +
                                                                    "* GOLCONDA BIRYANI HOUSE\n\n" +
                                                                    "* THE CHOCOLATE FACTORY\n\n" +
                                                                    "* ETCETERA COFFEE HOUSE\n\n" +
                                                                    "* ZIPPYZIGGY \n\n" +
                                                                    "* LAMBRETTA CLOTHING \n\n" +
                                                                    "* SUPER FINE BAKERY & COOL DRINKS \n\n" +
                                                                    "* A&W RESTAURANTS\n\n" +
                                                                    "* SWEET CAFÉ \n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;


                                                        case 22:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* FRESH N GROUND COFFEE SHOP\n\n" +
                                                                    "* 78 EAST \n\n" +
                                                                    "* KALYANAM SHOPPING MALL\n\n" +
                                                                    "* BARISTA\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* HYDERABAD HOUSE\n\n" +
                                                                    "* 78 DEGREES EAST\n\n" +
                                                                    "* SUBWAY \n\n" +
                                                                    "* SPENCERS\n\n" +
                                                                    "* KAKATIYA PARK\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 23:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Deer park,\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                        break;

                                                        case 24:
                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Shalimar theatre \n \n"+"* shanthi theatren\n \n"+"* Skyline theatre \n\n"+" *Brand Factory \n\n"+"* United colors of Benetton \n\n"+"* Flying Machine \n\n"+" *Pantaloons \n\n"+"*Domino’s Pizza \n\n"+"*MC Donald’s \n\n"+"* Dadu’s Mithai Vathika \n\n",Toast.LENGTH_LONG);
                                                            counttoast();
                                                        break;


                                                        case 25:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* PVR CINEMAS\n\n" +
                                                                    "* CHILI’S \n\n" +
                                                                    "* INORBIT MALL\n\n" +
                                                                    "* GOSSIP COFFEE SHOP\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 26:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* MINERVA COFFEE SHOP\n\n" +
                                                                    "* CINEMAX, ASIAN CINEMAS\n\n" +
                                                                    "* UNITED KITCHENS OF INDIA \n\n" +
                                                                    "* SVM MALL\n\n" +
                                                                    "* BEYOND COFFEE\n\n" +
                                                                    "* SVM MALL\n\n" +
                                                                    "* VAC’S\n\n" +
                                                                    "* MIRRORS\n\n" +
                                                                    "* MORE\n\n" +
                                                                    "* SUBWAY\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 27:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Kumar theatre\n\n"+

                                                        "*Padmavathi Cineplex \n\n"+" *Venkatramana Megaplex\n\n"+"* Adidas\n\n"+" *Life Style Factory Outlet\n\n"+"Madame\n\n"+"* Swiss Castle Bakers\n\n"+
                                                                        "*Hyderabad Biryani House Multi Cuisine Restaurant\n\n"+"*Derby Family Restaurant\n\n"+"*Food world \n\n"+

                                                        "*Temptations Ice Cream Parlour\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                        break;

                                                        case 28:mToastToShow =Toast.makeText(getApplicationContext(),"*Sensation Insomnia\n \n"+"* Sensation Sunshine Cinema Hall \n\n"+"* Raymonds Showroom \n\n"+
                                                                        "* Madhu Emporium\n\n"+
                                                                  "* UPto75.com\n\n"+

                                                                "* Pizza Hut\n\n"+"* Water Front\n\n"+"* Pizza Inn\n\n\"+\"*Amogh Hotel \n\n\"+\"*Amore Gelato\n\n",Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 29:mToastToShow =Toast.makeText(getApplicationContext(),"*Meena Bazar\n\n"+
                                                                        "* Chermas\n\n\"+ " +
                                                                        "* The Raymond Shop\n\n"+

                                                                "* Brand Factory\n\n"+"* Heart Beat \n \n\"+\"*Gokul Chat \n\n\"+\"*Sagar Papaji Ka  Dhaba\n\n"+"* Lius Chinese Restaurant\n\n"+"* Pariwar Dhaba\n\n"+
                                                                "*Pigeon Park n\n",Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 30:mToastToShow =Toast.makeText(getApplicationContext(),"*Cine planet multiplex \n\n"+"*Nescafe\n\n"+

                                                            "*Mehfil Dhaba\n\n"+"* Jayabheri Park\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 31:mToastToShow =Toast.makeText(getApplicationContext(),"*Cover Up\n\n"+"* Bogner\n \n"+"*SWAGATH-DE-ROYAL  Monte Carlo\n\n"+"* Mom n Me\n\n"+"* SUBWAY \n\n"+"* F Cafe Lounge\n\n"+"*Club 8\n\n"+"*The Grand Four Seasons\n\n"+"* Hadippa - the urban tadka\n\n"+
                                                                " *Nakshatra \n\n",Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 32:mToastToShow =Toast.makeText(getApplicationContext(),"*SVC Mahalakshmi Theatre\n \n"+"* Southindia Shopping mall\n\n"+"*The Raymond Shop\n\n"+"* Max shopping mall \n\n"+"* Reliance trendz\n \n"+
                                                            "*Paradise \n\n"+"*Chennai shopping mall \n\n"+"*Neeru’s \n\n"+"*Pantaloonsn\n\n"+"*Karachi bakery\n\n",Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 33:mToastToShow =Toast.makeText(getApplicationContext(),"*Arjun theatre\n\n"+"* viswanath theatre \n\n"+"* D Mart, Manjeera Trinity Mall\n\n"+"*Cinepolis VIP  \n\n"+"* Spykar\n\n"+"* Brand Factory\n\n"+
                                                                        "* Indian Spice Restaurant\n\n"+"* Hyderabad Chef Restaurant\n\n"+"* Sweet Magic Bakers &Confectioners\n\n"+"*KS Bakers\n\n",Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 34:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* THE CHOCOLATE ROOM\n" +
                                                                    "* CINEPOLIS, PVR CINEMAS\n\n" +
                                                                    "* CHAITANYA FOOD COURT\n\n" +
                                                                    "* CHENNAI SHOPPING MALL\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* CHUTNEYS\n\n" +
                                                                    "* KFC\n\n" +
                                                                    "* CREAM STONE\n\n" +
                                                                    "* SOUTH INDIA SHOPPING MALL\n\n" +
                                                                    "* US PIZZA\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 35: mToastToShow =Toast.makeText(getApplicationContext(),"*BVK Multiplex Vijayalakshmi theatre \n\n"+

                                                            "*White House  \n\n"+"*Laffaire \n\n"+"*Sri Balaji Handlooms\n\n"+"*Bliss Restaurant \n \n"+
                                                                        "* Classic Ice Cream Parlour  \n\n",Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 36:

                                                            mToastToShow =Toast.makeText(getApplicationContext(), "*Sensation Insomnia cinema hall \n\n" +

                                                                    " *Glory theatre \n\n" +

                                                                    "* Handloom Fabrics & Khadi Bhandar\n\n" +

                                                                    "*Classic Touch  \n\n" +

                                                                    "*Rajdoot\n\n" +

                                                                    "*Garden Bakery \n\n" +

                                                                    "*Hyderabad Cupcakes\n\n" +

                                                                    "*Roll On\n\n" +

                                                                    "* Universal Parlor\n\n" +

                                                                    "*Public Gardens\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 37:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*HiTech theatre \n\n"+

                                                            "* Hitech cinema hall \n\n"+

                                                            " *Neeru's Emporio\n\n"+

                                                            "*Fabindia \n\n"+

                                                            "*Shoppers Stop\n\n"+

                                                            "*Max Fashion\n\n"+

                                                            "*Ginger Court  \n\n"+

                                                            "* Little Hut\n\n"+

                                                            "*C-Factor Coffee Shop\n\n"+

                                                            "*JUST DONUTS\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 38:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Shiva Theatre\n\n"+

                                                            "* Chermas \n\n"+

                                                            "* Habeeb and Sons Cloth Merchant\n\n"+

                                                            "* Ashley Stewart\n\n"+

                                                            "* TJ Maxx \n\n"+

                                                            "* Roopanjali Silks\n\n"+

                                                            "* M S Bakery\n\n"+
                                                                    "*The Royal Palace Family Dhaba\n\n"+

                                                            "* Swiss cafe \n\n"+

                                                            "* Savera Hotel\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;



                                                        case 39:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* CINEPOLIS\n\n" +
                                                                    "* DOLPHIN BIRYANI HOUSE\n\n" +
                                                                    "* ANUTEX\n\n" +
                                                                    "* SAI RAM THEATRE \n\n" +
                                                                    "* REDDY'S KITCHEN \n\n" +
                                                                    "* RELIANCE FRESH\n\n" +
                                                                    "* R S BROTHERS\n\n" +
                                                                    "* LOTUS HERBAL BEAUTY CLINIC\n\n" +
                                                                    "* DAYANANDA NAGAR MUNICIPAL PARK \n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 40:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* \n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 41:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* BARISTA\n\n" +
                                                                    "* BIRYANI ART\n\n" +
                                                                    "* ROHAN’S SAREE HOUSE\n\n" +
                                                                    "* SREEJA SWEET SHOP\n\n" +
                                                                    "* CANE SPLASH SHOP & SPICY HUT \n\n" +
                                                                    "* 9 RESTAURANT \n\n" +
                                                                    "* SRI SIVA DURGA SAREE SHOP \n\n" +
                                                                    "* HERITAGE FRESH \n\n" +
                                                                    "* SRI HANUMAN MANDIR\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;


                                                        case 42:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* PRASAD’S MULTIPEX\n\n" +
                                                                    "* GREEN-LINE\n\n" +
                                                                    "* SANGEETHA PLAZA\n\n" +
                                                                    "* SANTOSH DHABA \n\n" +
                                                                    "* BIG NOODLE RESTAURANT \n\n" +
                                                                    "* NAVEEN SUPER MARKET \n\n" +
                                                                    "* TEMPTATIONS (ICE CREAM SHOP)\n\n" +
                                                                    "* THE COCOON - EMERGE REJUVINATED\n\n" +
                                                                    "* ADIDAS\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 43:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Mom & Me\n\n"+

                                                            "* Zodiac \n\n"+

                                                            "*Richie Rich\n\n"+

                                                            "* Passion Casuals and Formals\n\n"+

                                                            "* Reliance Trends\n\n"+

                                                            "* Pizza Hut\n\n"+

                                                            "* Domino's Pizza\n\n"+

                                                            "* The Golkonda Hotel  \n\n"+

                                                            "* Taj Banjara \n\n"+"*Paradise\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 44:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Amba theatre \n\n"+

                                                            "*Asian cinemas M cube mall \n\n"+

                                                            "* Inox\n\n"+

                                                            "*Khadim's\n\n"+

                                                            "* Koutons Showroom\n\n"+

                                                            "*Funtoosh\n\n"+

                                                            "* Anupama Restaurant\n\n"+

                                                            "* Meraj Cafe\n\n"+

                                                            "* Chandana Brothers Shopping MAll\n\n"+

                                                            "* Peter England\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 45:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*GAS Jeans\n\n"+

                                                            "*E'lan Studio \n\n"+

                                                            "*VIBRANT \n\n"+

                                                            "*Pick n Move\n\n"+

                                                            "* Lal Bawarchi Restaurant\n\n"+

                                                            "* Shanghai Fast Food  \n\n"+

                                                            "*Iyengar Bakery \n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 46:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Sai Ranga theatre \n\n"+

                                                            "*Cine town \n\n"+

                                                            "*Max\n\n"+

                                                            "* Exclamations \n\n"+

                                                            "* Balaji Fancy Readymade Store\n\n"+

                                                            "* Devi Hosiery And Sarees\n\n"+

                                                            "*Torrance Baker`s\n\n"+

                                                            "*Sai's Bakers World\n\n"+

                                                            "* Itsy Bitsy Bakers\n\n"+

                                                            "*Limra Bakery \n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 47:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Indian national theatre \n\n"+

                                                            "*Reebok\n\n"+

                                                            "* Vi Kingz Store\n\n"+

                                                            "* MEGAMART \n\n"+

                                                            "*Peter England\n\n"+

                                                            "*Shades Restaurant\n\n"+

                                                            "*Papaji Da Dhaba\n\n"+

                                                            "* Domino's Pizza \n\n"+

                                                            "* Bakers Q \n\n"+

                                                            "* Cafe Coffee Day\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 48:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Shanti theatre \n\n"+

                                                            "*deepak theatre \n\n"+

                                                            "* Srinivas theatren\n\n"+

                                                            "* Brand Factory\n\n"+

                                                            "* United Colors Of Benetton\n\n"+

                                                            "*Flying Machine\n\n"+

                                                            "*Mom & Me\n\n"+

                                                            "* Minerva Coffee Shop\n\n"+

                                                            "*KFC \n\n"+

                                                            "*The Chocolate Room\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 49:

                                                            mToastToShow = Toast.makeText(getApplicationContext(),"*Prasads IMAX \n\n"+

                                                            "*Prasads Multiplex \n\n"+

                                                            "* Spykar\n\n"+"* Pochampally Handloom House  \n\n"+

                                                            "* Roti Shhoti\n\n"+

                                                            "*ChungHua Restaurant\n\n"+

                                                            "* Manasarovar The Fern - Hotel in Hyderabad  \n\n"+

                                                            "*Haridwar\n\n"+

                                                            "* Bowl O China \n\n"+

                                                            "*Sanjeevaiah Park\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 50:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Asian GPR Multiplex \n\n"+

                                                            "* S.S World Of Fashion\n\n"+

                                                            "* OUTLOOKS Fashions & Boutique\n\n"+

                                                            "* Swathi Fashions\n\n"+

                                                            "* Cherry's Fashion Designers & Ladies Tailor \n\n"+

                                                            "*Bakers Inn\n\n"+

                                                            "* Sri Sai Raghavender Bakery\n\n"+

                                                            "RK DABBA\n\n"+

                                                            "*'Jungle' The Restaurant  \n\n"+

                                                            "Children's Park\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 51:

                                                            mToastToShow =Toast.makeText(getApplicationContext(), "*PVR cinemas \n\n" +

                                                                    "* INOX\n\n" +

                                                                    "* GVK One\n\n" +

                                                                    "* Hyderabad Central Mall\n\n" +

                                                                    "*Hard Rock Cafe\n\n" +

                                                                    "* Chutneys Coffee House  \n\n" +

                                                                    "* Subway\n\n" +

                                                                    "* Minerva Coffee Shop\n\n" +

                                                                    "*Mocha\n\n" +

                                                                    "*Jalagam Vengalrao Park  \n\n", Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 52:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Grills And Gravies\n\n"+

                                                            "*Crumb Town\n\n"+

                                                            "*Hot Cakes\n\n"+

                                                            "* New Bangalore Iyengar Bakery\n\n"+

                                                            "* Hot Plate\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;


                                                        case 53:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* THE COFFEE CUP\n\n" +
                                                                    "* ASIAN RADHIKA\n\n" +
                                                                    "* LEO’S FOOD COURT\n\n" +
                                                                    "* VAYAPURI SHOPPING COMPLEX\n\n" +
                                                                    "* CASABLANCA COFFEE\n\n" +
                                                                    "* RELIANCE SUPER\n\n" +
                                                                    "* LEOS FOOD COURT \n\n" +
                                                                    "* SAI BABA TEMPLE\n\n" +
                                                                    "* BOWL O CHINA \n\n" +
                                                                    "* INVOGUE\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 54:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* FIESTA THE COFFEE SHOP\n\n" +
                                                                    "* DREAM LAND, TIVOLI \n\n" +
                                                                    "* PARADISE \n\n" +
                                                                    "* CHENNAI SHOPPING MALL\n\n" +
                                                                    "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* 24 HRS COFFEE SHOP\n\n" +
                                                                    "* NANKING\n\n" +
                                                                    "* DOMINOS\n\n" +
                                                                    "* PARADE GROUND\n\n" +
                                                                    "* HERITAGE FRESH\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 55:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Galaxy theatre \n\n"+

                                                            "* Brand Factory\n\n"+

                                                            "*Just Buddy Clothing Store\n\n"+

                                                            "*Mom & Me \n\n"+

                                                            "*Mahesh Garments  \n\n"+

                                                            "* McDonald's\n\n"+

                                                            "* Just bake \n\n"+

                                                            "*The Golden Season\n\n"+

                                                            "* Kokam Kitchen\n\n"+

                                                            "*Marwadi Chat and Panipuri\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 56:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* BITS AND BYTES\n\n" +
                                                                    "* BIG CINEMAS LEONIA,\n\n" +
                                                                    "* PRAKRUTA-ALANKRITA RESORT\n\n" +
                                                                    "* SHOPPING MARKET\n\n" +
                                                                    "* STAR COFFEE SHOP\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 57:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* HOTEL GALAXY COFFEE SHOP\n\n" +
                                                                    "* ASIAN M CUBE\n\n"+
                                                                    "* INOX CINEMA\n\n" +
                                                                    "* HYDERABAD HOUSE\n\n" +
                                                                    "* MOM AND ME\n\n" +
                                                                    "* SHIVALAY\n\n" +
                                                                    "* OYSTER AIRPORT HOTEL\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 58:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*PVR Cinemas\n\n"+

                                                            "* KALANIKETHAN WEDDINGMALL\n\n"+

                                                            "* Reebok\n\n"+

                                                            "* Blackberrys\n\n"+

                                                            "*Sculler \n\n"+

                                                            "*Manyavar \n\n"+

                                                            "* The Park Hotel\n\n"+

                                                            "* Minerva Coffee Shop\n\n"+

                                                            "*KFC \n\n"+

                                                            "*Seventh Heaven Restaurent\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 59:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* CAFÉ COFFEE DAY\n\n" +
                                                                    "* BIG CINEMAS\n\n" +
                                                                    "* HOTEL VINFLORA\n\n" +
                                                                    "* BRAND FACTORY\n\n" +
                                                                    "* DI BELLA COFFEE\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;

                                                        case 60:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*WaterFront\n\n"+

                                                            "*1857\n\n"+

                                                            "*Subway Restaurant  \n\n"+

                                                            "*Cafe Coffee Day  \n\n"+

                                                            "*HyderabadiBiryanis.com\n\n"+

                                                            "* Amore Gelato\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 61:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Aaradhana theatre\n\n"+

                                                            "* GAS Jeans\n\n"+

                                                            "*E'lan Studio\n\n"+

                                                            "*Hyderabad House\n\n"+

                                                            "* Goodlands Restaurant\n\n"+

                                                            "*Swagath Grand Hotel\n\n"+

                                                            "* GoldBawarche Resturant\n\n"+

                                                            "*PicknMove\n\n"+

                                                            "*NYPFC\n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 62:

                                                            mToastToShow =Toast.makeText(getApplicationContext(),"*Galaxy theatre\n\n"+

                                                            "*Play Boyz Casual Wear\n\n"+

                                                            "* Reebok \n\n"+

                                                            "* LEE \n\n"+

                                                            "* ATTITUDE\n\n"+

                                                            "*Flying Machine \n\n"+

                                                            "* 4 Seasons Multi Cuisine Restaurant\n\n"+

                                                            "* Hotel Rumaan\n\n"+

                                                            "*Adam's Victoria Resturant\n\n"+

                                                            "*Subway \n\n",Toast.LENGTH_LONG);
                                                            counttoast();

                                                            break;

                                                        case 63:
                                                            mToastToShow =Toast.makeText(getApplicationContext(), "* COFFEE MAHAL\n\n" +
                                                                    "* ASIAN CINESQUARE\n\n" +
                                                                    "* MASTER CHEF , RESTAUR \n\n" +
                                                                    "* DECATHLON UPPAL\n\n" +
                                                                    "* COFFEE LOUNGE\n\n", Toast.LENGTH_LONG);
                                                            counttoast();
                                                            break;


                                                    }
                                                }
                                            });

                    editsearch.addTextChangedListener(new TextWatcher() {
                        //Event when changed word on EditTex
                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            ArrayList<String> temp = new ArrayList<String>();
                            int textlength = editsearch.getText().length();
                            temp.clear();
                            for (int i = 0; i < mItems.size(); i++)
                            {
                                if (textlength <= mItems.get(i).length())
                                {
                                    if(editsearch.getText().toString().equalsIgnoreCase(
                                            (String)
                                                    mItems.get(i).subSequence(0,
                                                            textlength)))
                                    {
                                        temp.add(mItems.get(i));
                                    }
                                }
                            }
                            listView.setAdapter(new ArrayAdapter<String>(hangout.this,android.R.layout.simple_list_item_1, temp));


                        }


                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count,
                                                      int after) {
                            // TODO Auto-generated method stub

                        }
                        @Override
                        public void afterTextChanged(Editable s) {
                            // TODO Auto-generated method stub

                        }
                    });

                }

                @Override
                public boolean onCreateOptionsMenu(Menu menu) {
                    // Inflate the menu; this adds items to the action bar if it is present.
                    getMenuInflater().inflate(R.menu.menu_hangoutclass, menu);
                    return true;
                }


    public void counttoast()
    {
        CountDownTimer toastCountDown;
        toastCountDown = new CountDownTimer(toastDurationInMilliSeconds, 1000 /*Tick duration*/) {
            public void onTick(long millisUntilFinished) {
                mToastToShow.show();
            }
            public void onFinish() {
                mToastToShow.cancel();
            }
        };

        // Show the toast and starts the countdown
        mToastToShow.show();
        toastCountDown.start();
    }
            }

