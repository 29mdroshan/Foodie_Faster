package com.example.foodie_faster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;

import com.example.foodie_faster.adapter.IndianFoodAdapter;
import com.example.foodie_faster.adapter.PopularFoodAdapter;
import com.example.foodie_faster.model.IndianFood;
import com.example.foodie_faster.model.PopularFood;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Main_Page extends AppCompatActivity {
    FloatingActionButton fab;
    RecyclerView popularRecycler, indianRecycler;
    PopularFoodAdapter popularFoodAdapter;
    IndianFoodAdapter indianFoodAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);




        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("Mutton Biryani", "300", R.drawable.biryani, "45 Min", "5.0", "NON VEGITERIAN FOOD", "Biryani is a spiced mix of meat and rice, traditionally cooked over an open fire in a leather pot. It is combined in different ways with a variety of components to create a number of highly tasty and unique flavor combinations"));
        popularFoodList.add(new PopularFood("Butter Chicken", "400", R.drawable.bc, "35 Min", "4.8", "NON VEGITERIAN FOOD", "Butter chicken or murgh makhani is a curry of chicken in a spiced tomato, butter and cream sauce. It originated in India as a curry. Butter Chicken simmers in a buttery tomato sauce and is punctuated by several special spices and herbs"));
        popularFoodList.add(new PopularFood("KFC Chicken", "300", R.drawable.popularfood2, "25 Min", "4.0", "NON VEGITERIAN FOOD", "KFC' chicken product is pressure fried chicken pieces, seasoned with Sanders' recipe of 11 herbs and spices You are tasting sweet, salty, and umami, or savoriness. The human mouth craves those flavours."));
        popularFoodList.add(new PopularFood("Chicken Wings", "330", R.drawable.popularfood3, "20 Min", "4.5", "NON VEGITERIAN FOOD", "chicken wings, or simply wings, deep-fried, unbreaded chicken wings or drums coated with a vinegar-and-cayenne-pepper hot sauce mixed with butter. They are commonly served with celery and a blue cheese dipping sauce."));
        popularFoodList.add(new PopularFood("Pizza", "350", R.drawable.piza, "30 Min", "4.3", "VEGITERIAN FOOD", "Pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients."));
        popularFoodList.add(new PopularFood("Ice Cream", "200", R.drawable.ice, "20 Min", "3.8", "VEGITERIAN FOOD", "A rich, sweet, creamy frozen food made from variously flavored cream and milk products churned or stirred to a smooth consistency during the freezing process and often containing gelatin, eggs, fruits, nuts."));

        setPopularRecycler(popularFoodList);


        List<IndianFood> indianFoodList = new ArrayList<>();
        indianFoodList.add(new IndianFood("Mysore Dosa", "150", R.drawable.dosa, "4.5", "Dosa Point", "35 Min", "VEGETERIAN  FOOD", "Mysore dosa is a popular South Indian breakfast where a crispy crepe made of fermented rice and lentil batter is served with flavorful spiced potato curry. It is a wholesome meal in itself as it is served with potato masala, Coconut chutney and Sambar"));
        indianFoodList.add(new IndianFood("Butter Chicken", "400", R.drawable.bc, "4.8", "Khans Resturent", "35 Min", "NON VEGETERIAN  FOOD", "Butter chicken or murgh makhani is a curry of chicken in a spiced tomato, butter and cream sauce. It originated in India as a curry. Butter Chicken simmers in a buttery tomato sauce and is punctuated by several special spices and herbs"));
        indianFoodList.add(new IndianFood("Mushroom Soup", "250", R.drawable.soup, "4.7", "Food Locate Resturent", "20 Min", "VEGETERIAN  FOOD", "Mushroom is a thick soup that is commonly used as an ingredient for recipes. Cream of Mushroom soup is made with either cream or milk, bits of mushrooms and onions, chicken broth, seasonings."));
        indianFoodList.add(new IndianFood("Mutton Biryani", "300", R.drawable.biryani, "5.0", "Empire Resturent", "45 Min", "NON VEGITERIAN FOOD", "Biryani is a spiced mix of meat and rice, traditionally cooked over an open fire in a leather pot. It is combined in different ways with a variety of components to create a number of highly tasty and unique flavor combinations"));
        indianFoodList.add(new IndianFood("Chole Buture", "100", R.drawable.bhature, "4.0", "Ashirvad Hotel", "20 Min", "VEGETERIAN  FOOD", "Chole Bhature also known as Chana Bhatura is one of the most popular Punjabi dish liked almost all over India. Chole stands for a spiced tangy chickpea curry and Bhatura is a soft and fluffy fried leavened bread."));
        indianFoodList.add(new IndianFood("KFC Chicken", "300", R.drawable.popularfood2, "4.0", "KFC", "28 Min", "NON VEGITERIAN FOOD", "KFC' chicken product is pressure fried chicken pieces, seasoned with Sanders' recipe of 11 herbs and spices You are tasting sweet, salty, and umami, or savoriness. The human mouth craves those flavours."));
        indianFoodList.add(new IndianFood("Chicken Wings", "330", R.drawable.popularfood3, "4.5", "MC Donalds", "20 Min", "NON VEGITERIAN FOOD", "chicken wings, or simply wings, deep-fried, unbreaded chicken wings or drums coated with a vinegar-and-cayenne-pepper hot sauce mixed with butter. They are commonly served with celery and a blue cheese dipping sauce."));
        indianFoodList.add(new IndianFood("Burger", "70", R.drawable.burger, "4.2", "Burger King", "15 Min", "VEGETERIAN  FOOD", "Burger is a food, typically considered a sandwich, consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled"));
        indianFoodList.add(new IndianFood("Pizza", "350", R.drawable.pizza, "30 Min", "Pizza Hut", "30 Min", "VEGITERIAN FOOD", "Pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients."));

        indianFoodList.add(new IndianFood("Freid Rice", "200", R.drawable.rice, "3.3", "Sip n Snack", "20 Min", "VEGETERIAN  FOOD", "a popular and flavoured rice recipe made with cooked rice, finely chopped veggies and seasoning ingredients. it is a staple food to many south-east asian countries it tastes great when served with manchurian gravy."));
        indianFoodList.add(new IndianFood("RasMalai", "100", R.drawable.malai, "4.5", "MahaLakshmi", "22 Min", "VEGETERIAN  FOOD", "Rasmalai is basically a creamy and milky syrup that consist of Chenna (cottage cheese) balls. The syrup is purely made from milk, sugar, cream and saffron mixture. ... The sugary white cream coloured or yellow coloured balls "));
        indianFoodList.add(new IndianFood(" Pastry Cake", "600", R.drawable.cake, "4.4", "Dolpline", "50 Min", "VEGETERIAN  FOOD", "Pastry is a dough of flour, water and shortening (solid fats, including butter or lard) that may be savoury or sweetened. Sweetened pastries are often described as bakers' confectionery"));
        indianFoodList.add(new IndianFood("Ice Cream", "200", R.drawable.icec, "4.7 Min", "Ice Corner", "18 Min", "VEGITERIAN FOOD", "A rich, sweet, creamy frozen food made from variously flavored cream and milk products churned or stirred to a smooth consistency during the freezing process and often containing gelatin, eggs, fruits, nuts."));
        setIndianRecycler(indianFoodList);


    }

    private void setPopularRecycler(List<PopularFood> popularFoodList) {
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void setIndianRecycler(List<IndianFood> indianFoodList) {
        indianRecycler = findViewById(R.id.indian_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        indianRecycler.setLayoutManager(layoutManager);
        indianFoodAdapter = new IndianFoodAdapter(this, indianFoodList);
        indianRecycler.setAdapter(indianFoodAdapter);


    }

    public void buttonPopupwindow(View view) {
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View viewPopupwindow = layoutInflater.inflate(R.layout.popupwindowlayout, null);
        final PopupWindow popupWindow = new PopupWindow(viewPopupwindow, 900, 700, true);
        popupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 0);


    }



}

