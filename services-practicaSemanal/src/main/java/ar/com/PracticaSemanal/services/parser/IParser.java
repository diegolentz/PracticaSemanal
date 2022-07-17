
package ar.com.PracticaSemanal.services.parser;

import ar.com.PracticaSemanal.services.exceptions.ParseException;

public interface IParser<T> {

	public T parse() throws ParseException;
}