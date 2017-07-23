package com.skcc.lazybook.sample.model;

import org.springframework.stereotype.Component;

/**
 * @author Koo Minjeong
 * @since 1.0
 */

@Component
public class Sample {

	private String data;

	public Sample() {
		data = "Let's Party!!";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Sample [data=" + data + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Sample other = (Sample) obj;
		if (!data.equals(other.data))
			return false;
		return true;
	}

}
