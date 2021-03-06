/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ee.ut.cs.dsg.dsg.exercise2;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Observation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1137987074386360234L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Observation\",\"namespace\":\"ee.ut.cs.dsg.dsg.exercise2\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"doc\":\"The observation id\"},{\"name\":\"prefVal\",\"type\":\"double\",\"doc\":\"The actual measurement from the sensor\"},{\"name\":\"measurement\",\"type\":\"string\",\"doc\":\"The measurement type, e.g., temperature\"},{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"The measurement timestamp\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Observation> ENCODER =
      new BinaryMessageEncoder<Observation>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Observation> DECODER =
      new BinaryMessageDecoder<Observation>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Observation> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Observation> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Observation> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Observation>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Observation to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Observation from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Observation instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Observation fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The observation id */
   private long id;
  /** The actual measurement from the sensor */
   private double prefVal;
  /** The measurement type, e.g., temperature */
   private java.lang.CharSequence measurement;
  /** The measurement timestamp */
   private long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Observation() {}

  /**
   * All-args constructor.
   * @param id The observation id
   * @param prefVal The actual measurement from the sensor
   * @param measurement The measurement type, e.g., temperature
   * @param timestamp The measurement timestamp
   */
  public Observation(java.lang.Long id, java.lang.Double prefVal, java.lang.CharSequence measurement, java.lang.Long timestamp) {
    this.id = id;
    this.prefVal = prefVal;
    this.measurement = measurement;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return prefVal;
    case 2: return measurement;
    case 3: return timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: prefVal = (java.lang.Double)value$; break;
    case 2: measurement = (java.lang.CharSequence)value$; break;
    case 3: timestamp = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The observation id
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * The observation id
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'prefVal' field.
   * @return The actual measurement from the sensor
   */
  public double getPrefVal() {
    return prefVal;
  }


  /**
   * Sets the value of the 'prefVal' field.
   * The actual measurement from the sensor
   * @param value the value to set.
   */
  public void setPrefVal(double value) {
    this.prefVal = value;
  }

  /**
   * Gets the value of the 'measurement' field.
   * @return The measurement type, e.g., temperature
   */
  public java.lang.CharSequence getMeasurement() {
    return measurement;
  }


  /**
   * Sets the value of the 'measurement' field.
   * The measurement type, e.g., temperature
   * @param value the value to set.
   */
  public void setMeasurement(java.lang.CharSequence value) {
    this.measurement = value;
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
   * Creates a new Observation RecordBuilder.
   * @return A new Observation RecordBuilder
   */
  public static ee.ut.cs.dsg.dsg.exercise2.Observation.Builder newBuilder() {
    return new ee.ut.cs.dsg.dsg.exercise2.Observation.Builder();
  }

  /**
   * Creates a new Observation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Observation RecordBuilder
   */
  public static ee.ut.cs.dsg.dsg.exercise2.Observation.Builder newBuilder(ee.ut.cs.dsg.dsg.exercise2.Observation.Builder other) {
    if (other == null) {
      return new ee.ut.cs.dsg.dsg.exercise2.Observation.Builder();
    } else {
      return new ee.ut.cs.dsg.dsg.exercise2.Observation.Builder(other);
    }
  }

  /**
   * Creates a new Observation RecordBuilder by copying an existing Observation instance.
   * @param other The existing instance to copy.
   * @return A new Observation RecordBuilder
   */
  public static ee.ut.cs.dsg.dsg.exercise2.Observation.Builder newBuilder(ee.ut.cs.dsg.dsg.exercise2.Observation other) {
    if (other == null) {
      return new ee.ut.cs.dsg.dsg.exercise2.Observation.Builder();
    } else {
      return new ee.ut.cs.dsg.dsg.exercise2.Observation.Builder(other);
    }
  }

  /**
   * RecordBuilder for Observation instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Observation>
    implements org.apache.avro.data.RecordBuilder<Observation> {

    /** The observation id */
    private long id;
    /** The actual measurement from the sensor */
    private double prefVal;
    /** The measurement type, e.g., temperature */
    private java.lang.CharSequence measurement;
    /** The measurement timestamp */
    private long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ee.ut.cs.dsg.dsg.exercise2.Observation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.prefVal)) {
        this.prefVal = data().deepCopy(fields()[1].schema(), other.prefVal);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.measurement)) {
        this.measurement = data().deepCopy(fields()[2].schema(), other.measurement);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Observation instance
     * @param other The existing instance to copy.
     */
    private Builder(ee.ut.cs.dsg.dsg.exercise2.Observation other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.prefVal)) {
        this.prefVal = data().deepCopy(fields()[1].schema(), other.prefVal);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.measurement)) {
        this.measurement = data().deepCopy(fields()[2].schema(), other.measurement);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * The observation id
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * The observation id
      * @param value The value of 'id'.
      * @return This builder.
      */
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * The observation id
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * The observation id
      * @return This builder.
      */
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'prefVal' field.
      * The actual measurement from the sensor
      * @return The value.
      */
    public double getPrefVal() {
      return prefVal;
    }


    /**
      * Sets the value of the 'prefVal' field.
      * The actual measurement from the sensor
      * @param value The value of 'prefVal'.
      * @return This builder.
      */
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder setPrefVal(double value) {
      validate(fields()[1], value);
      this.prefVal = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'prefVal' field has been set.
      * The actual measurement from the sensor
      * @return True if the 'prefVal' field has been set, false otherwise.
      */
    public boolean hasPrefVal() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'prefVal' field.
      * The actual measurement from the sensor
      * @return This builder.
      */
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder clearPrefVal() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'measurement' field.
      * The measurement type, e.g., temperature
      * @return The value.
      */
    public java.lang.CharSequence getMeasurement() {
      return measurement;
    }


    /**
      * Sets the value of the 'measurement' field.
      * The measurement type, e.g., temperature
      * @param value The value of 'measurement'.
      * @return This builder.
      */
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder setMeasurement(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.measurement = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'measurement' field has been set.
      * The measurement type, e.g., temperature
      * @return True if the 'measurement' field has been set, false otherwise.
      */
    public boolean hasMeasurement() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'measurement' field.
      * The measurement type, e.g., temperature
      * @return This builder.
      */
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder clearMeasurement() {
      measurement = null;
      fieldSetFlags()[2] = false;
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
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder setTimestamp(long value) {
      validate(fields()[3], value);
      this.timestamp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * The measurement timestamp
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * The measurement timestamp
      * @return This builder.
      */
    public ee.ut.cs.dsg.dsg.exercise2.Observation.Builder clearTimestamp() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Observation build() {
      try {
        Observation record = new Observation();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.prefVal = fieldSetFlags()[1] ? this.prefVal : (java.lang.Double) defaultValue(fields()[1]);
        record.measurement = fieldSetFlags()[2] ? this.measurement : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.timestamp = fieldSetFlags()[3] ? this.timestamp : (java.lang.Long) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Observation>
    WRITER$ = (org.apache.avro.io.DatumWriter<Observation>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Observation>
    READER$ = (org.apache.avro.io.DatumReader<Observation>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeDouble(this.prefVal);

    out.writeString(this.measurement);

    out.writeLong(this.timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.prefVal = in.readDouble();

      this.measurement = in.readString(this.measurement instanceof Utf8 ? (Utf8)this.measurement : null);

      this.timestamp = in.readLong();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.prefVal = in.readDouble();
          break;

        case 2:
          this.measurement = in.readString(this.measurement instanceof Utf8 ? (Utf8)this.measurement : null);
          break;

        case 3:
          this.timestamp = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










