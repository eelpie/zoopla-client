package uk.co.eelpieconsulting.landregistry.zoopla;

import java.math.BigDecimal;

import org.mongodb.morphia.converters.SimpleValueConverter;
import org.mongodb.morphia.converters.TypeConverter;
import org.mongodb.morphia.mapping.MappedField;
import org.mongodb.morphia.mapping.MappingException;

public class BigDecimalConvertor extends TypeConverter implements SimpleValueConverter {

	public BigDecimalConvertor() {
		super(BigDecimal.class);
	}

	@Override
	public Object encode(Object value, MappedField optionalExtraInfo) {

		if (value == null) {
			return null;
		}
		BigDecimal bigDecimalValue = (BigDecimal) value;

		return bigDecimalValue.intValue();

	}
	
	@Override
	public Object decode(Class targetClass, Object fromDBObject, MappedField optionalExtraInfo) throws MappingException {
		 Integer dbo = (Integer) fromDBObject;
		 if (dbo == null) {
			 return null;
		 }
		 
		 return new BigDecimal(dbo);
	}
	
}
