package average;

import java.io.IOException;


import org.apache.hadoop.io.FloatWritable;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

public class LocationMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, FloatWritable> {
	

	public void map(LongWritable key, Text value, OutputCollector<Text, FloatWritable> output, Reporter reporter) throws IOException {

		String valueString = value.toString();
		String[] SingleData = valueString.split(",");
		
		
		float f = Float.valueOf(SingleData[2]);
		output.collect(new Text(SingleData[0]), new FloatWritable(Float.valueOf(f)));
		
		
		
		
	}
}

