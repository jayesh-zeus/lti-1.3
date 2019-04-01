package edu.uoc.elc.lti.tool.deeplinking.content;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@RequiredArgsConstructor
@Setter
@Getter
public abstract class Item {
	private final String type;
}
