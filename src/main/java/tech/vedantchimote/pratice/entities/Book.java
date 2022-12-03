package tech.vedantchimote.pratice.entities;

import lombok.*;

import javax.persistence.*;

/**
 * @author : Vedant Chimote
 * @mailto : vedantc.code@gmail.com
 * @created : 03-12-2022, Saturday
 **/

@Entity
@Table(name = "project_books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;


}
