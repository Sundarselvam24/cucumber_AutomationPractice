package com.ap.configuration;

import java.io.IOException;

public class ReaderManager {

	public static ReaderManager getInstance() throws IOException {

		ReaderManager rm = new ReaderManager();
		rm.getPropertyReader();
		return rm;
	}

	public PropertyReader getPropertyReader() throws IOException {

		PropertyReader reader = new PropertyReader();
		return reader;
	}
}
