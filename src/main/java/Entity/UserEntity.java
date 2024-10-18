package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private ProfileEntity profile;

    @OneToMany(mappedBy = "assigned_user",cascade = CascadeType.ALL)
    private TaskEntity task;

    @ManyToMany
    @JoinTable(name = "user_projects", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private ProjectEntity project;

}

