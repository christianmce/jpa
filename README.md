# Spring Data JPA Course - Dr. Christian Mauricio Castillo Estrada
@GeneratedValue(strategy = GenerationType.AUTO)

La anotación @GeneratedValue permite configurar la forma de incremento de la columna especificada (campo).
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Id @SequenceGenerator(name="seq",sequenceName="oracle_seq")        
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
