# Spring Data JPA Course - Dr. Christian Mauricio Castillo Estrada
@GeneratedValue(strategy = GenerationType.AUTO)

La anotación @GeneratedValue permite configurar la forma de incremento de la columna especificada (campo).

  # @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
El generador IDENTITY permite que una columna de enteros/bigints se incremente automáticamente a pedido.Se basa en una columna de base de datos con incremento automático y permite que la base de datos genere un nuevo valor con cada operación de inserción. 

  # @Id @SequenceGenerator(name="seq",sequenceName="oracle_seq")        
  # @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
Una SECUENCIA es un objeto de base de datos que genera números enteros incrementales en cada solicitud sucesiva. Las SECUENCIAS son mucho más flexibles que las columnas IDENTIFICADOR porque: Una SECUENCIA no tiene tablas y la misma secuencia se puede asignar a varias columnas o tablas
  
  # @Id @GeneratedValue(strategy= GenerationType.AUTO)
El GenerationType.AUTO es el tipo de generación por defecto y permite que el proveedor de persistencia elegir la estrategia de generación. Si usa Hibernate como su proveedor de persistencia, selecciona una estrategia de generación basada en el dialecto específico de la base de datos.

  
