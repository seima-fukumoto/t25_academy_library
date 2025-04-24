package jp.co.metateam.library.model;

import java.security.Timestamp;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * 書籍マスタDTO
 */
@Getter
@Setter
public class BookMstDto {
    
    private Long id; 
    
    private String title;
    private String isbn;
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public String getIsbn() {
      return isbn;
    }
    public void setIsbn(String isbn) {
      this.isbn = isbn;
    }
    private Timestamp deletedAt;

    private BookMst bookMst;

    
}



