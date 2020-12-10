# KSQL/Kafka Streams Assignment


## Before

# LOOK AT ALL THE TASKS BEFORE STARTING!

```bash
kafka-topics --bootstrap-server kafka1:9092 --partitions 2 --create --topic observations 
kafka-topics --bootstrap-server kafka1:9092 --partitions 2 --create --topic capacities 

```

- Run [People Producer](./src/main/java/ee/ut/cs/dsg/PeopleProducer.java)
- Run [Capacity Producer](./src/main/java/ee/ut/cs/dsg/CapacityProducer.java)

## KSQL/STREAMS

## Task 0

- Create the STREAM/TABLE ```OBSERVATIONS``` from the observations topic 
- Create the STREAM/TABLE ```CAPACITIES``` from the capacities topic

```sql
CREATE STREAM OBSERVATIONS (title VARCHAR KEY, observations VARCHAR) WITH (kafka_topic='observations', value_format='json');

CREATE STREAM CAPACITIES (title VARCHAR KEY, capacities VARCHAR) WITH (kafka_topic='capacities', value_format='json');
```

## Task 1

Count the number of people for each room
- CREATE A STREAM/TABLE called ```NUMPEPROOM``` that contains the count
- Provide the topology for the KSQL/KStreams program using [https://zz85.github.io/kafka-streams-viz/](https://zz85.github.io/kafka-streams-viz/)

```sql
CREATE STREAM NUMPEPROOM (room_id VARCHAR KEY, count INT) WITH (kafka_topic='capacities', value_format='json');
```

```
your topology code here
```


![Your topology image her](./todo.png)

## Task 2

Count the number of people for each room every 15 seconds
- tumbling in processing time every 15 seconds; 
    - create a stream/table called ```NUMPEPROOM15S``` 
    - Provide the topology for the KSQL/KStreams program

```sql
CREATE STREAM NUMPEPROOM15S (room_id VARCHAR KEY, count INT) WITH (kafka_topic='capacities', value_format='json');
```

```
your topology code here
```

![Your topology image her](./todo.png)

- tumbling in event time every 15 seconds 
    -  provide evidence of event time: in KSQL using the ```DESCRIBE``` function, 
    in Kafka streams using the timestamp extractor
    -  create a stream/table called ```NUMPEPROOM15S_ET``` 
    -  Provide the topology for the KSQL/KStreams program


```sql
your KSQL statements here
```

```
your topology code here
```

![Your topology image her](./todo.png)

- [OPTIONAL]: redo with hopping window

## Task 3

Identify the rooms that contains more people than the allowed ones (capacity)

- Perform the calculation in a rolling manner (no window)
  + Create a stream/table called ```ANOMALIESROLL``` 
  + Provide the topology for the KSQL/KStreams program


```sql
CREATE STREAM ANOMALIESROLL (room_id VARCHAR KEY, count INT) WITH (kafka_topic='capacities', value_format='json');
```

```
your topology code here
```

![Your topology image her](./todo.png)

- perform the calculation using a window of 15 seconds tumbling in processing time
  + Create a stream/table called ```ANOMALIES15S``` 
  + Provide the topology for the KSQL/KStreams program


```sql
CREATE STREAM ANOMALIESROLL (room_id VARCHAR KEY, count INT) WITH (kafka_topic='capacities', value_format='json');
```

```
Topology
Sub-topologies:
Sub-topology: 0
	Source:  KSTREAM-SOURCE-0000000000 (topics: [conversation-meta])
	--> KSTREAM-TRANSFORM-0000000001
	Processor: KSTREAM-TRANSFORM-0000000001 (stores: [conversation-meta-state])
	--> KSTREAM-KEY-SELECT-0000000002
	<-- KSTREAM-SOURCE-0000000000
	Processor: KSTREAM-KEY-SELECT-0000000002 (stores: [])
	--> KSTREAM-FILTER-0000000005
	<-- KSTREAM-TRANSFORM-0000000001
	Processor: KSTREAM-FILTER-0000000005 (stores: [])
	--> KSTREAM-SINK-0000000004
	<-- KSTREAM-KEY-SELECT-0000000002
	Sink: KSTREAM-SINK-0000000004 (topic: count-resolved-repartition)
	<-- KSTREAM-FILTER-0000000005
Sub-topology: 1
	Source: KSTREAM-SOURCE-0000000006 (topics: [count-resolved-repartition])
	--> KSTREAM-AGGREGATE-0000000003
	Processor: KSTREAM-AGGREGATE-0000000003 (stores: [count-resolved])
	--> KTABLE-TOSTREAM-0000000007
	<-- KSTREAM-SOURCE-0000000006
	Processor: KTABLE-TOSTREAM-0000000007 (stores: [])
	--> KSTREAM-SINK-0000000008
	<-- KSTREAM-AGGREGATE-0000000003
	Sink: KSTREAM-SINK-0000000008 (topic: streams-count-resolved)
	<-- KTABLE-TOSTREAM-0000000007
```


![Your topology image her](./todo.png)

HINT: You **can** reuse the tables ```NUMPEPROOM``` and ```NUMPEPROOM15S```  if needed.
HINT: Stream-Table Join vs Table-Table Join

Question: can you join NUMPEPROOM with CAPACITIES?
Yes, because it has similar schema

Question: can you join NUMPEPROOM15S with CAPACITIES?
No, because of 15s tumbling
