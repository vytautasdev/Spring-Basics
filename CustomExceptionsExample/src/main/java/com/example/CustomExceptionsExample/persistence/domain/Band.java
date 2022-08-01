package com.example.CustomExceptionsExample.persistence.domain;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

//    public Band(Long id, String name, List<Musician> musicians) {
//        this.id = id;
//        this.name = name;
//        this.musicians = musicians;
//    }
//
//    public Band() {
//    }

    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Musician> musicians = new ArrayList<>();

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Musician> getMusicians() {
//        return musicians;
//    }
//
//    public void setMusicians(List<Musician> musicians) {
//        this.musicians = musicians;
//    }
}
