package org.example.task_management_system.entity;
  import lombok.*;
  import jakarta.persistence.*;
  import org.springframework.boot.autoconfigure.web.WebProperties;
  import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
  @Table(name="users")
  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
      private String name;
      @Column(unique = true)
    private String email;
    @JsonIgnore
      private String password;
      private String role;

}
