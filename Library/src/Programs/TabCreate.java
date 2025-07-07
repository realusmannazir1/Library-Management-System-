package com.lib.library;

import java.util.Map;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class TabCreate {
    Retrive b =new Retrive();
    
    public TabPane tabPane() {
        TabPane tabPane = new TabPane();
        tabPane.getStyleClass().add("centered-tab-pane");
        tabPane.setPrefSize(600, 400);
        
        Tab tab1 = new Tab("Home");
        Tab tab2 = new Tab("Books");
        Tab tab3 = new Tab("Members");

         TableView<Map<String, Object>> table = new TableView<>();

          b.loadData(table,"select book_id ,book_name,author,edition from books");
          table.setPrefSize(700,800);
        VBox layout = new VBox(table);
       

        tab2.setContent(layout);



        




        // Disable closing for all tabs
        tab1.setClosable(false);
        tab2.setClosable(false);
        tab3.setClosable(false);
        
        tabPane.getTabs().addAll(tab1, tab2, tab3);
        
        return tabPane;
    }
}