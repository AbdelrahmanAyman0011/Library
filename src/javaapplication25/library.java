/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author sp
 */
public class library extends javax.swing.JFrame {
    
    public library() {
        initComponents();
        onCreate();// to start when open
    }
    

ArrayList <String> BList = new ArrayList <> ();// arraylist to add book name
ArrayList <String> AuotherList = new ArrayList <> ();//arraylist to add auother name
ArrayList <String> AuotherInfList = new ArrayList <> (); //arraylist to add information Auother 
ArrayList <String> BookInfList = new ArrayList <> ();// arraylist to add information book
ArrayList <String> borrowedList = new ArrayList <> ();// arraylist to add (borrowed)or (Not-borrowed)  
ArrayList <Boolean> boList = new ArrayList <> ();//arraylist to add true or false and can get it




DefaultListModel dm = new DefaultListModel();//to can connect with Jlist to add and delete 
int count = 0 ;// counter of borrow 
// to add element
 // add (book name , auother name , borrow(true) or not(false) , book information , auother info ) // this to add elements
public void add (String name,String Auother, boolean borrow,String Book_info,String Auother_info){
    if (dm.size()<=20){
     list.setModel(dm);
     dm.addElement(name);
     BList.add(name);
     count_books.setText(String.valueOf(BList.size()));//get number of books form book name list and set it to (count_books)
     AuotherInfList.add(Auother_info);
     BookInfList.add(Book_info);
     AuotherList.add(Auother);
     // if borrow or not-borrow
     if ( borrow == true){
         count++;
       boList.add(true);
       statue.setText("Borrowed");
       borrowedList.add("Borrowed");
       count_borrowed.setText(String.valueOf(count));
     }else{
         statue.setText("Not-Borrowed");
          borrowedList.add("Not-Borrowed");
         boList.add(false);
     }
    }
}

// on start add 4 element
 public void onCreate (){
     // add (book name , auother name , borrow(true) or not(false) , book information , auother info ) // this to add elements
    add("Bayn El Kasrain","Naguib Mahfouz",false,"The novel 0ollows al-Sayyid Ahmad Abd al-Jawad as the head of his household; Amina, his sons, Yasin, Fahmy and Kamal, and his daughters, Khadija and Aisha. He sets strict rules of Muslim piety and sobriety in the household. al-Sayyid Ahmad permits himsel0 conventionally forbidden pleasures. In particular, these include music, drinking wine and conducting numerous extramarital a00airs with women he meets at his grocery store, or with courtesans who entertain parties of men at their houses with music and dancing. His insistence on his household authority forbids his wi0e and children 0rom questioning why he stays out late at night or comes home intoxicated.","Naguib Mahfouz Abdelaziz Ibrahim Ahmed Al-Basha was an Egyptian writer who won the 1988 Nobel Prize in Literature. Mahfouz is regarded as one of the 0irst contemporary writers in the Arabic literature, along with Taha Hussein, to explore themes of existentialism. ");
    add("Kasr El Shawk","Naguib Mahfouz",false,"The novel 0ollows al-Sayyid Ahmad Abd al-Jawad as the head of his household; Amina, his sons, Yasin, Fahmy and Kamal, and his daughters, Khadija and Aisha. He sets strict rules of Muslim piety and sobriety in the household. al-Sayyid Ahmad permits himsel0 conventionally forbidden pleasures. In particular, these include music, drinking wine and conducting numerous extramarital a00airs with women he meets at his grocery store, or with courtesans who entertain parties of men at their houses with music and dancing. His insistence on his household authority forbids his wi0e and children 0rom questioning why he stays out late at night or comes home intoxicated.","Naguib Mahfouz Abdelaziz Ibrahim Ahmed Al-Basha was an Egyptian writer who won the 1988 Nobel Prize in Literature. Mahfouz is regarded as one of the 0irst contemporary writers in the Arabic literature, along with Taha Hussein, to explore themes of existentialism. ");
    add("El sokareya","Naguib Mahfouz",true,"The novel 0ollows al-Sayyid Ahmad Abd al-Jawad as the head of his household; Amina, his sons, Yasin, Fahmy and Kamal, and his daughters, Khadija and Aisha. He sets strict rules of Muslim piety and sobriety in the household. al-Sayyid Ahmad permits himsel0 conventionally forbidden pleasures. In particular, these include music, drinking wine and conducting numerous extramarital a00airs with women he meets at his grocery store, or with courtesans who entertain parties of men at their houses with music and dancing. His insistence on his household authority forbids his wi0e and children 0rom questioning why he stays out late at night or comes home intoxicated.","Naguib Mahfouz Abdelaziz Ibrahim Ahmed Al-Basha was an Egyptian writer who won the 1988 Nobel Prize in Literature. Mahfouz is regarded as one of the 0irst contemporary writers in the Arabic literature, along with Taha Hussein, to explore themes of existentialism. ");
    add("Children of Gebelawi","Naguib Mahfouz",false,"Children of Gebelawi is a novel by the Egyptian writer and Nobel laureate Naguib Mahfouz. It is also known by its Egyptian dialectal transliteration, Awlad Haretna, and by the alternative translated transliteral Arabic title of Children of Our Alley.","Naguib Mahfouz Abdelaziz Ibrahim Ahmed Al-Basha was an Egyptian writer who won the 1988 Nobel Prize in Literature. Mahfouz is regarded as one of the 0irst contemporary writers in the Arabic literature, along with Taha Hussein, to explore themes of existentialism. ");
    
}
// method to add informatin book , auother to 2 dimintion arry and can get it
 int n = 20 ;
public String B (int a , int b) {
     String[][] B = new String[n][2];
        if (a<20){
            B[a][0] =  AuotherInfList.get(a);//get from arraylist information aouther to add 2 diminntion arry
            B[a][1] =  BookInfList.get(a);//get from arraylist information book to add 2 diminntion arry
            
        }
       
        return B[a][b];
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        count_books = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        count_borrowed = new javax.swing.JLabel();
        input_B = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        Auother_Name = new javax.swing.JTextField();
        Book_Name = new javax.swing.JTextField();
        index_book = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        statue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("library ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        input.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        input.setBorder(javax.swing.BorderFactory.createTitledBorder("Book id "));
        input.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication25/icons8-remove-book-48.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication25/icons8-logout-48.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Exit Program");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("delete a book");

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication25/icons8-check-book-48.png"))); // NOI18N
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("check out");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(exit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("books : ");

        count_books.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        count_books.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("borrowed : ");

        count_borrowed.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        count_borrowed.setText("0");

        input_B.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        input_B.setBorder(javax.swing.BorderFactory.createTitledBorder("book name"));
        input_B.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count_books, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count_borrowed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_B, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input_B))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(count_borrowed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(count_books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        input.getAccessibleContext().setAccessibleName("book id ");

        list.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("mux of books number is 20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("add new book");

        add.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication25/icons8-add-book-48.png"))); // NOI18N
        add.setActionCommand("add new book");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        Auother_Name.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Auother_Name.setBorder(javax.swing.BorderFactory.createTitledBorder("Auother"));
        Auother_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Auother_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Auother_NameActionPerformed(evt);
            }
        });

        Book_Name.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Book_Name.setBorder(javax.swing.BorderFactory.createTitledBorder("Book name "));
        Book_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Book_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_NameActionPerformed(evt);
            }
        });

        index_book.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        index_book.setForeground(new java.awt.Color(0, 204, 51));
        index_book.setText("0");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("id of Book :");

        Area2.setColumns(20);
        Area2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Area2.setRows(5);
        Area2.setBorder(javax.swing.BorderFactory.createTitledBorder("About Book"));
        jScrollPane2.setViewportView(Area2);

        Area1.setColumns(20);
        Area1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Area1.setRows(5);
        Area1.setBorder(javax.swing.BorderFactory.createTitledBorder("About Auother"));
        jScrollPane3.setViewportView(Area1);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("Statue: ");

        statue.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        statue.setText("Not-Borrowed");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Book_Name)
                    .addComponent(Auother_Name)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(index_book, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statue))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Book_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Auother_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(index_book, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(statue)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Auother_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Auother_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Auother_NameActionPerformed

    private void Book_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Book_NameActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       // delete button to delete from all arraylist 

        int index = list.getSelectedIndex();
        dm.remove(index);
        AuotherInfList.remove(index);
        BookInfList.remove(index);
        boList.remove(index);
        BList.remove(index);
        AuotherList.remove(index);
        count_books.setText(String.valueOf(BList.size()));
        if ("Borrowed".equals(statue.getText())){
        count--;
       count_borrowed.setText(String.valueOf(count));
        }
// this to make input fieled Empty
        Book_Name.setText("");
        Auother_Name.setText("");
        Area1.setText("");
        Area2.setText("");
    }//GEN-LAST:event_deleteActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
       // to search with id 
            int id =(int) (Double.parseDouble(input.getText())) ;
            if (id<dm.getSize() ){
            index_book.setText(String.valueOf(id));
            Book_Name.setText(BList.get(id));
            Auother_Name.setText(AuotherList.get(id));
            Area1.setText("about the auother: " + B(id,0));
            Area2.setText("about the book: " + B(id,1));
             }
            
    }//GEN-LAST:event_inputActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
       // add button to new book // check borrow or not after add
        if ("borrowed".equals(statue.getText())||"Borrowed".equals(statue.getText())){
        add(Book_Name.getText(),Auother_Name.getText(),true,Area2.getText(),Area1.getText());
        // this to make input fieled Empty
        Book_Name.setText("");
        Auother_Name.setText("");
        Area1.setText("");
        Area2.setText("");
        
      
    }else {
          add(Book_Name.getText(),Auother_Name.getText(),false,Area2.getText(),Area1.getText());
          // this to make input fieled Empty
        Book_Name.setText("");
        Auother_Name.setText("");
        Area1.setText("");
        Area2.setText("");
      
        }
    }//GEN-LAST:event_addActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        // on click element to display all information about of it   
        int index = list.getSelectedIndex();
         index_book.setText(String.valueOf(index));        
         Book_Name.setText(list.getSelectedValue().toString());
         Auother_Name.setText(AuotherList.get(index));
         Area1.setText("about the auother: " + B(index,0));
         Area2.setText("about the book: " + B(index,1));
          if (boList.get(index)==true){
              statue.setText("Borrowed");
          }else{
              statue.setText("Not-Borrowed");
          }
    }//GEN-LAST:event_listMouseClicked

    private void input_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_BActionPerformed
       // to search with id of book
          String SearchAuother = input_B.getText();
          for (int i = 0 ; i<dm.getSize();i++){
            if (SearchAuother.equals(BList.get(i))){
            index_book.setText(String.valueOf(i));
            Book_Name.setText(BList.get(i));
            Auother_Name.setText(AuotherList.get(i));
            Area1.setText("about the auother: " + B(i,0));
            Area2.setText("about the book: " + B(i,1));
            }
          }
    }//GEN-LAST:event_input_BActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        // TODO add your handling code here:
         int index = list.getSelectedIndex();
         borrowedList.set(index, "Borrowed");
         boList.set(index, true);
         statue.setText("Borrowed");
         count++;
         count_borrowed.setText(String.valueOf(count));
    }//GEN-LAST:event_exit1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JTextField Auother_Name;
    private javax.swing.JTextField Book_Name;
    private javax.swing.JButton add;
    private javax.swing.JLabel count_books;
    private javax.swing.JLabel count_borrowed;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel index_book;
    private javax.swing.JTextField input;
    private javax.swing.JTextField input_B;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> list;
    private javax.swing.JTextField statue;
    // End of variables declaration//GEN-END:variables
}
