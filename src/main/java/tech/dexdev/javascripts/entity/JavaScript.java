package tech.dexdev.javascripts.entity;

import jakarta.persistence.*;

@Entity
@Table(name="java_scripts")
public class JavaScript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String note;
    @Enumerated(EnumType.STRING)
    private Category category;

    public JavaScript() {
    }

    public JavaScript(Long id, String note, Category category) {
        this.id = id;
        this.note = note;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "JavaScripts{" +
                "id=" + id +
                ", note='" + note + '\'' +
                ", category=" + category +
                '}';
    }
}
