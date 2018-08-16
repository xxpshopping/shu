package average;

import java.io.IOException;
import java.util.*;


import org.apache.hadoop.io.FloatWritable;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

public class LocationReducer extends MapReduceBase implements Reducer<Text, FloatWritable, Text, FloatWritable> {

	public void reduce(Text t_key, Iterator<FloatWritable> values, OutputCollector<Text,FloatWritable> output, Reporter reporter) throws IOException {
		Text key = t_key;
		float frequencyForCountry = 0;
		int num=0;
		float avg=0;
		while (values.hasNext()) {
			// replace type of value with the actual type of our value
			FloatWritable value = values.next();
			frequencyForCountry += value.get();
			//frequencyForCountry+=Integer.parseInt(values.toString());
			num+=1;
		}
		avg=frequencyForCountry/num;
		output.collect(key, new FloatWritable(avg));
	}
}
