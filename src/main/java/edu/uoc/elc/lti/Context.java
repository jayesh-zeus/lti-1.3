package edu.uoc.elc.lti;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@Getter
@Setter
public class Context {
	private String id;
	private String label;
	private String title;
	private List<String> type;

}
