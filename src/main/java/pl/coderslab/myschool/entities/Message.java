package pl.coderslab.myschool.entities;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column(name = "message_body", columnDefinition = "text")
    private String messageBody;

    @ManyToOne
    @JoinColumn(name = "sender")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver")
    private User receiver;



    //musimy mieć odbiorcę i nadawcę
}
