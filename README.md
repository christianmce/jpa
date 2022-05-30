# Spring Data JPA Course 
## Dr. Christian Mauricio Castillo Estrada
@GeneratedValue(strategy = GenerationType.AUTO)

La anotación @GeneratedValue permite configurar la forma de incremento de la columna especificada (campo).

  **@Id @GeneratedValue(strategy = GenerationType.IDENTITY)**
El generador IDENTITY permite que una columna de enteros/bigints se incremente automáticamente a pedido.Se basa en una columna de base de datos con incremento automático y permite que la base de datos genere un nuevo valor con cada operación de inserción. 

  **@Id @SequenceGenerator(name="seq",sequenceName="oracle_seq")**      
  **@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")**
Una SECUENCIA es un objeto de base de datos que genera números enteros incrementales en cada solicitud sucesiva. Las SECUENCIAS son mucho más flexibles que las columnas IDENTIFICADOR porque: Una SECUENCIA no tiene tablas y la misma secuencia se puede asignar a varias columnas o tablas
  
  **@Id @GeneratedValue(strategy= GenerationType.AUTO)**
El GenerationType.AUTO es el tipo de generación por defecto y permite que el proveedor de persistencia elegir la estrategia de generación. Si usa Hibernate como su proveedor de persistencia, selecciona una estrategia de generación basada en el dialecto específico de la base de datos.


  
## Relationship in JPA

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

Cascade es una herramienta más de JPA e Hibernate, y es tarea del programador saber acertar en su uso. Cascade puede tanto facilitarnos la tarea como amargarnos la existencia si no se usa correctamente. Para un mismo tipo de relación caben muchas posibilidades. La respuesta es que depende de la funcionalidad del modelo de nuestra relación.

Las operaciones en cascada de JPA / Hibernate, representadas en el enum javax.persistence.CascadeType, son:

CascadeType.ALL: se aplican todos los tipos de cascada.
CascadeType.PERSIST: las operaciones de guardado en la base de datos de las entidades padre se propagarán a las entidades relacionadas.
CascadeType.MERGE: las entidades relacionadas se unirán al contexto de persistencia cuando la entidad propietaria se una.
CascadeType.REMOVE: las entidades relacionadas se eliminan de la base de datos cuando la entidad propietaria se elimine.
CascadeType.REFRESH: las entidades relacionadas actualizan sus datos desde la base de datos cuando la entidad propietaria se actualiza.
CascadeType.DETACH: se separan del contexto de persistencia todas las entidades relacionadas cuando ocurre una operación de separación manual.
