/**
 * 
 */
package exceptions;

import org.springframework.http.HttpStatus;

import lombok.Data;
/**
 * @author SAMSUNG
 *
 */


@SuppressWarnings("serial")
@Data
public class TodoException extends RuntimeException{
	    private String message;
	    private HttpStatus httpStatus;

	    public TodoException(String message, HttpStatus httpStatus) {
	        super(message);
	        this.setMessage(message);
	        this.setHttpStatus(httpStatus);
	    }

		public HttpStatus getHttpStatus() {
			return httpStatus;
		}

		public void setHttpStatus(HttpStatus httpStatus) {
			this.httpStatus = httpStatus;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	

}
