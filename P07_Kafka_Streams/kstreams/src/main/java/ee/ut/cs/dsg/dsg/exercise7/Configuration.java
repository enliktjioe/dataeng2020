/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ee.ut.cs.dsg.dsg.exercise7;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Configuration extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2368080721594692327L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Configuration\",\"namespace\":\"ee.ut.cs.dsg.dsg.exercise6\",\"fields\":[{\"name\":\"count\",\"type\":\"int\",\"doc\":\"The preferred value from the count\"},{\"name\":\"room\",\"type\":\"int\",\"doc\":\"The room number\"},{\"name\":\"floor\",\"type\":\"int\",\"doc\":\"The floor number\"},{\"name\":\"building\",\"type\":\"int\",\"doc\":\"The building number\"},{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"The measurement timestamp\"},{\"name\":\"author\",\"type\":\"string\",\"doc\":\"The author of the configuration\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Configuration> ENCODER =
      new BinaryMessageEncoder<Configuration>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Configuration> DECODER =
      new BinaryMessageDecoder<Configuration>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Configuration> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Configuration> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Configuration> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Configuration>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Configuration to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Configuration from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Configuration instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Configuration fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The preferred value from the count */
   private int count;
  /** The room number */
   private int room;
  /** The floor number */
   private int floor;
  /** The building number */
   private int building;
  /** The measurement timestamp */
   private long timestamp;
  /** The author of the configuration */
   private java.lang.CharSequence author;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Configuration() {}

  /**
   * All-args constructor.
   * @param count The preferred value from the count
   * @param room The room number
   * @param floor The floor number
   * @param building The building number
   * @param timestamp The measurement timestamp
   * @param author The author of the configuration
   */
  public Configuration(java.lang.Integer count, java.lang.Integer room, java.lang.Integer floor, java.lang.Integer building, java.lang.Long timestamp, java.lang.CharSequence author) {
    this.count = count;
    this.room = room;
    this.floor = floor;
    this.building = building;
    this.timestamp = timestamp;
    this.author = author;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return count;
    case 1: return room;
    case 2: return floor;
    case 3: return building;
    case 4: return timestamp;
    case 5: return author;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: count = (java.lang.Integer)value$; break;
    case 1: room = (java.lang.Integer)value$; break;
    case 2: floor = (java.lang.Integer)value$; break;
    case 3: building = (java.lang.Integer)value$; break;
    case 4: timestamp = (java.lang.Long)value$; break;
    case 5: author = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'count' field.
   * @return The preferred value from the count
   */
  public int getCount() {
    return count;
  }


  /**
   * Sets the value of the 'count' field.
   * The preferred value from the count
   * @param value the value to set.
   */
  public void setCount(int value) {
    this.count = value;
  }

  /**
   * Gets the value of the 'room' field.
   * @return The room number
   */
  public int getRoom() {
    return room;
  }


  /**
   * Sets the value of the 'room' field.
   * The room number
   * @param value the value to set.
   */
  public void setRoom(int value) {
    this.room = value;
  }

  /**
   * Gets the value of the 'floor' field.
   * @return The floor number
   */
  public int getFloor() {
    return floor;
  }


  /**
   * Sets the value of the 'floor' field.
   * The floor number
   * @param value the value to set.
   */
  public void setFloor(int value) {
    this.floor = value;
  }

  /**
   * Gets the value of the 'building' field.
   * @return The building number
   */
  public int getBuilding() {
    return building;
  }


  /**
   * Sets the value of the 'building' field.
   * The building number
   * @param value the value to set.
   */
  public void setBuilding(int value) {
    this.building = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The measurement timestamp
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * The measurement timestamp
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'author' field.
   * @return The author of the configuration
   */
  public java.lang.CharSequence getAuthor() {
    return author;
  }


  /**
   * Sets the value of the 'author' field.
   * The author of the configuration
   * @param value the value to set.
   */
  public void setAuthor(java.lang.CharSequence value) {
    this.author = value;
  }

  /**
   * Creates a new Configuration RecordBuilder.
   * @return A new Configuration RecordBuilder
   */
  public static Configuration.Builder newBuilder() {
    return new Configuration.Builder();
  }

  /**
   * Creates a new Configuration RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Configuration RecordBuilder
   */
  public static Configuration.Builder newBuilder(Configuration.Builder other) {
    if (other == null) {
      return new Configuration.Builder();
    } else {
      return new Configuration.Builder(other);
    }
  }

  /**
   * Creates a new Configuration RecordBuilder by copying an existing Configuration instance.
   * @param other The existing instance to copy.
   * @return A new Configuration RecordBuilder
   */
  public static Configuration.Builder newBuilder(Configuration other) {
    if (other == null) {
      return new Configuration.Builder();
    } else {
      return new Configuration.Builder(other);
    }
  }

  /**
   * RecordBuilder for Configuration instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Configuration>
    implements org.apache.avro.data.RecordBuilder<Configuration> {

    /** The preferred value from the count */
    private int count;
    /** The room number */
    private int room;
    /** The floor number */
    private int floor;
    /** The building number */
    private int building;
    /** The measurement timestamp */
    private long timestamp;
    /** The author of the configuration */
    private java.lang.CharSequence author;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Configuration.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.count)) {
        this.count = data().deepCopy(fields()[0].schema(), other.count);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.room)) {
        this.room = data().deepCopy(fields()[1].schema(), other.room);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.floor)) {
        this.floor = data().deepCopy(fields()[2].schema(), other.floor);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.building)) {
        this.building = data().deepCopy(fields()[3].schema(), other.building);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.author)) {
        this.author = data().deepCopy(fields()[5].schema(), other.author);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Configuration instance
     * @param other The existing instance to copy.
     */
    private Builder(Configuration other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.count)) {
        this.count = data().deepCopy(fields()[0].schema(), other.count);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.room)) {
        this.room = data().deepCopy(fields()[1].schema(), other.room);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.floor)) {
        this.floor = data().deepCopy(fields()[2].schema(), other.floor);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.building)) {
        this.building = data().deepCopy(fields()[3].schema(), other.building);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.author)) {
        this.author = data().deepCopy(fields()[5].schema(), other.author);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'count' field.
      * The preferred value from the count
      * @return The value.
      */
    public int getCount() {
      return count;
    }


    /**
      * Sets the value of the 'count' field.
      * The preferred value from the count
      * @param value The value of 'count'.
      * @return This builder.
      */
    public Configuration.Builder setCount(int value) {
      validate(fields()[0], value);
      this.count = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'count' field has been set.
      * The preferred value from the count
      * @return True if the 'count' field has been set, false otherwise.
      */
    public boolean hasCount() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'count' field.
      * The preferred value from the count
      * @return This builder.
      */
    public Configuration.Builder clearCount() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'room' field.
      * The room number
      * @return The value.
      */
    public int getRoom() {
      return room;
    }


    /**
      * Sets the value of the 'room' field.
      * The room number
      * @param value The value of 'room'.
      * @return This builder.
      */
    public Configuration.Builder setRoom(int value) {
      validate(fields()[1], value);
      this.room = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'room' field has been set.
      * The room number
      * @return True if the 'room' field has been set, false otherwise.
      */
    public boolean hasRoom() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'room' field.
      * The room number
      * @return This builder.
      */
    public Configuration.Builder clearRoom() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'floor' field.
      * The floor number
      * @return The value.
      */
    public int getFloor() {
      return floor;
    }


    /**
      * Sets the value of the 'floor' field.
      * The floor number
      * @param value The value of 'floor'.
      * @return This builder.
      */
    public Configuration.Builder setFloor(int value) {
      validate(fields()[2], value);
      this.floor = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'floor' field has been set.
      * The floor number
      * @return True if the 'floor' field has been set, false otherwise.
      */
    public boolean hasFloor() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'floor' field.
      * The floor number
      * @return This builder.
      */
    public Configuration.Builder clearFloor() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'building' field.
      * The building number
      * @return The value.
      */
    public int getBuilding() {
      return building;
    }


    /**
      * Sets the value of the 'building' field.
      * The building number
      * @param value The value of 'building'.
      * @return This builder.
      */
    public Configuration.Builder setBuilding(int value) {
      validate(fields()[3], value);
      this.building = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'building' field has been set.
      * The building number
      * @return True if the 'building' field has been set, false otherwise.
      */
    public boolean hasBuilding() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'building' field.
      * The building number
      * @return This builder.
      */
    public Configuration.Builder clearBuilding() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * The measurement timestamp
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * The measurement timestamp
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public Configuration.Builder setTimestamp(long value) {
      validate(fields()[4], value);
      this.timestamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * The measurement timestamp
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * The measurement timestamp
      * @return This builder.
      */
    public Configuration.Builder clearTimestamp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'author' field.
      * The author of the configuration
      * @return The value.
      */
    public java.lang.CharSequence getAuthor() {
      return author;
    }


    /**
      * Sets the value of the 'author' field.
      * The author of the configuration
      * @param value The value of 'author'.
      * @return This builder.
      */
    public Configuration.Builder setAuthor(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.author = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'author' field has been set.
      * The author of the configuration
      * @return True if the 'author' field has been set, false otherwise.
      */
    public boolean hasAuthor() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'author' field.
      * The author of the configuration
      * @return This builder.
      */
    public Configuration.Builder clearAuthor() {
      author = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Configuration build() {
      try {
        Configuration record = new Configuration();
        record.count = fieldSetFlags()[0] ? this.count : (java.lang.Integer) defaultValue(fields()[0]);
        record.room = fieldSetFlags()[1] ? this.room : (java.lang.Integer) defaultValue(fields()[1]);
        record.floor = fieldSetFlags()[2] ? this.floor : (java.lang.Integer) defaultValue(fields()[2]);
        record.building = fieldSetFlags()[3] ? this.building : (java.lang.Integer) defaultValue(fields()[3]);
        record.timestamp = fieldSetFlags()[4] ? this.timestamp : (java.lang.Long) defaultValue(fields()[4]);
        record.author = fieldSetFlags()[5] ? this.author : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Configuration>
    WRITER$ = (org.apache.avro.io.DatumWriter<Configuration>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Configuration>
    READER$ = (org.apache.avro.io.DatumReader<Configuration>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.count);

    out.writeInt(this.room);

    out.writeInt(this.floor);

    out.writeInt(this.building);

    out.writeLong(this.timestamp);

    out.writeString(this.author);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.count = in.readInt();

      this.room = in.readInt();

      this.floor = in.readInt();

      this.building = in.readInt();

      this.timestamp = in.readLong();

      this.author = in.readString(this.author instanceof Utf8 ? (Utf8)this.author : null);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.count = in.readInt();
          break;

        case 1:
          this.room = in.readInt();
          break;

        case 2:
          this.floor = in.readInt();
          break;

        case 3:
          this.building = in.readInt();
          break;

        case 4:
          this.timestamp = in.readLong();
          break;

        case 5:
          this.author = in.readString(this.author instanceof Utf8 ? (Utf8)this.author : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










