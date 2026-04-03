package com.amjad.careershiksha.ui.booklistActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Booklist;
import com.amjad.careershiksha.utils.BooklistAdapter;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Booklist> bookList;
    private BooklistAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        recyclerView = findViewById(R.id.recycler_View);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        String department = getIntent().getStringExtra("department");
        String semester   = getIntent().getStringExtra("semester");

        if (department == null) department = "";
        if (semester == null) semester = "";

        bookList = new ArrayList<>();

        // ------------------- BOOK DATA ----------------------

        if (department.equalsIgnoreCase("Computer Engineering")) {

            if (semester.equalsIgnoreCase("Semester 1")) {
                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2024/05/25912-600x807.jpg",
                        "Physics-1",
                        R.raw.computer_peripherals));

                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2024/05/26711-600x850.jpg",
                        "Basic Electricity",
                        R.raw.computer_peripherals));

                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2024/03/28511-600x833.jpg",
                        "Computer Office Application",
                        R.raw.computer_peripherals));

                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2023/10/25911-1-600x806.jpg",
                        "Mathematics-1",
                        R.raw.computer_peripherals));

                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2024/01/21011-3-600x816.jpg",
                        "Engineering Drawing",
                        R.raw.computer_peripherals));

                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2024/01/25712-2-600x808.jpg",
                        "English-1",
                        R.raw.computer_peripherals));

                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2024/01/25711-3-600x814.jpg",
                        "Bangla-1",
                        R.raw.computer_peripherals));

                bookList.add(new Booklist(
                        "https://haquepublications.com/wp-content/uploads/2024/01/25911-Solution-2-600x809.jpg",
                        "Mathematics-1 (Solution)",
                        R.raw.computer_peripherals));
            }

//            if (semester.equalsIgnoreCase("Semester 1")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/25912-600x807.jpg", "Physics-1", R.raw.computer_peripherals));
////                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26711-600x850.jpg", "Basic Electricity", R.raw.computer_peripherals));
////                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/28511-600x833.jpg", "Computer Office Application", R.raw.computer_peripherals));
////                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2023/10/25911-1-600x806.jpg", "Mathematics-1", R.raw.computer_peripherals));
////                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/21011-3-600x816.jpg", "Engineering Drawing", R.raw.computer_peripherals));
////                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25712-2-600x808.jpg", "English-1", R.raw.computer_peripherals));
////                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25711-3-600x814.jpg", "Bangla-1", R.raw.computer_peripherals));
////                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25911-Solution-2-600x809.jpg", "Mathematics-1 (Solution)", R.raw.computer_peripherals));
//            }

//            else if (semester.equalsIgnoreCase("Semester 2")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/25913-600x826.jpg", "Chemistry", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/28522-600x835.jpg", "Computer Graphics Design-1", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/26811-600x812.jpg", "Basic Electronics", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25721-600x836.jpg", "Bangla-2", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/28521-600x827.jpg", "Python Programming", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25921-600x805.jpeg", "Mathematics-2", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25921s-600x810.jpeg", "Mathematics-2 (Solution)", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25722-600x828.jpg", "English-2", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25812-600x812.jpg", "Physical Education & Life Skill", R.raw.computer_peripherals));
//            }
//
//            else if (semester.equalsIgnoreCase("Semester 4")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/28544-2-600x830.jpg", "Web Design & Development-1", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/28543-600x811.jpg", "Computer Peripherals", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26841-600x812.jpg", "Digital Electronics-2", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/28541-600x814.jpg", "Java Programming", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/28542-600x814.jpg", "Data Structure & Algorithm", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/29041.jpg", "Environmental Studies", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25831-1-600x826.jpg", "Business Communication", R.raw.computer_peripherals));
//            }
//
//            else if (semester.equalsIgnoreCase("Semester 6")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/07/28562-1-600x808.jpg", "Computer Networking", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/07/28563-1-600x806.jpg", "Sensor & IOT System", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/07/28566-450x600.jpg", "Web Development Project", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/07/28564-600x810.jpg", "Microcontroller System Design", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/28561-600x818.jpg", "Database Management", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/28565-600x815.jpg", "Surveillance Security", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25851-1-600x833.jpg", "Principles of Marketing", R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25852-1-600x818.jpg", "Industrial Management", R.raw.computer_peripherals));
//            }
        }
//        else if(department.equalsIgnoreCase("Electrical Engineering")) {
//            if (semester.equalsIgnoreCase("Semester 1")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/26712-1-600x832.jpg", "Electrical Engineering Materials",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/25912-600x807.jpg", "Physics-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26711-600x850.jpg", "Basic Electricity",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25812-600x812.jpg", "Physical Education & Life Skill Development",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/21011-3-600x816.jpg", "Engineering Drawing",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25911-Solution-2-600x809.jpg", "Mathematics-1(Solution)",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25711-3-600x814.jpg", "Bangla-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25712-2-600x808.jpg", "English-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2023/10/25911-1-600x806.jpg", "Mathematics-1",R.raw.computer_peripherals));
//            }else if (semester.equalsIgnoreCase("Semester 2")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/25922-1-600x827.jpg", "Physics-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26721-600x836.jpg", "Electrical Circuits-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/04/26722-1-600x837.jpg", "Electrical Engineering Drawing",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/26811-600x812.jpg", "Basic Electronics",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25721-600x836.jpg", "Bangla-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25921-600x805.jpeg", "Mathematics-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25921s-600x810.jpeg", "Mathemaics-2(Solution)",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25722-600x828.jpg", "English-2",R.raw.computer_peripherals));
//            }else if(semester.equalsIgnoreCase("Semester 4")){
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/27044-1-600x809.jpg", "Applied Mechanics",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/26845-1-600x808.jpg", "Digital Electronics",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/26743-600x810.jpg", "Electrical Engineering Project-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26741-600x814.jpg", "Electrical Installation,Planning & Estimating",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/WhatsApp-Image-2025-08-17-at-10.40.42-AM-600x824.jpeg", "Accounting",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26742-600x815.jpg", "Dc Machine",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/04/25811-600x816.jpg", "Social Science",R.raw.computer_peripherals));
//            }else if(semester.equalsIgnoreCase("Semester 6")){
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/26762-600x805.jpeg", "Transmission & Distribution of Electrical Power-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/26763-600x808.jpg", "Electrical & Electronic Measurements-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26842-1-600x813.jpg", "Communication Engineering",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/28567-600x806.jpg", "Programming in C",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/29041.jpg", "Environmental Studies",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/26761-600x807.jpg", "Ac Machines-1",R.raw.computer_peripherals));
//            }
//        }else if(department.equalsIgnoreCase("Civil Engineering")) {
//            if (semester.equalsIgnoreCase("Semester 1")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/25913-600x826.jpg", "Chemistry",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26711-600x850.jpg", "Basic Electricity",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/04/25811-600x816.jpg", "Social Science",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/26411-2-600x828.jpg", "Civil Engineering Materials",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25911-Solution-2-600x809.jpg", "Mathematics-1(Solution)",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/21011-3-600x816.jpg", "Engineering Drawing",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25712-2-600x808.jpg", "English-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/01/25711-3-600x814.jpg", "Bangla-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2023/10/25911-1-600x806.jpg", "Mathematics-1",R.raw.computer_peripherals));
//            }else if (semester.equalsIgnoreCase("Semester 2")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/25912-600x807.jpg", "Physics-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26421-600x832.jpg", "Civil Engineering Drawing",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/04/27011-600x827.jpg", "Basic Workshop Practics",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/26811-600x812.jpg", "Basic Electronics",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25721-600x836.jpg", "Bangla -2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25921-600x805.jpeg", "Mathematics-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25722-600x828.jpg", "English-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25812-600x812.jpg", "Physical Education & Life Skill Development",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/03/25921s-600x810.jpeg", "Mathematics-2(Solution)",R.raw.computer_peripherals));
//            }else if (semester.equalsIgnoreCase("Semester 4")) {
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/06/26446-2-600x807.jpg", "Hydrology",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26444-1-600x806.jpg", "Surveying-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26521-600x833.jpg", "Wood Workshop Practice",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26445-600x807.jpg", "Geotechnical Engineering",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26442-600x820.jpg", "Estimaing & Costing-1",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26441-600x811.jpg", "Construction Process-2",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/WhatsApp-Image-2025-08-17-at-10.40.42-AM-600x824.jpeg", "Accounting",R.raw.computer_peripherals));
//                bookList.add(new Booklist("https://haquepublications.com/wp-content/uploads/2024/05/26443-600x808.jpg", "Civil Cad-1",R.raw.computer_peripherals));
//            }
//        }

        // Default no book
        if (bookList.isEmpty()) {
            bookList.add(new Booklist(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfhxWiF9b",
                    "No Book Found", -1
            ));
        }

        // ------------------- ADAPTER ----------------------
        adapter = new BooklistAdapter(bookList);
        recyclerView.setAdapter(adapter);
    }
}
