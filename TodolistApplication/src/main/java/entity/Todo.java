/**
 * 
 */
package entity;

import org.springframework.data.annotation.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Generated;

@Entity
public class Todo {
	    @Id
	    @Generated(strategy = GenerationType.AUTO)
	    private Long id;
	    private String Task1=getContent1();
	    private String Task2=getContent2();
	    private String Task3=getContent3(); 
	    
	    private Boolean completed = Boolean.FALSE;

	    public Todo() {
	    }

	    public Todo(Long id, String task1,String task2,String task3, Boolean completed) {
	        this.id = id;
	        this.Task1 = task1;
	        this.Task2 = task2;
	        this.Task3 = task3;
	        this.completed = completed;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getContent1() {
	        return Task1;
	    }
	    
	    public String getContent2() {
	        return Task2;
	    }
        
	    public String getContent3() {
	        return Task3;
	    }
	    
	    public void setContent1(String content1) {
	        this.Task1 = content1;
	    }
	    
	    public void setContent2(String content2) {
	        this.Task1 = content2;
	    }
	    
	    public void setContent3(String content3) {
	        this.Task1 = content3;
	    }
	    
	    public Boolean getCompleted() {
	        return completed;
	    }

	    public void setCompleted(Boolean completed) {
	        this.completed = completed;
	    }
}
