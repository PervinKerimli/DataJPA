package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int phoneNumber;
    private String address;

    @OneToOne(mappedBy = "profile",cascade = CascadeType.ALL)
    private UserEntity user;
}
