package gr.codelearn.spring.showcase.hackathon.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class ActivityKey implements Serializable {
	private Long contentId;
	private Long authorId;
}