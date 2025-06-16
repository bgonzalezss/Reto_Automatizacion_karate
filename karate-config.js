function fn() {
  var config = {
    // Aquí puedes agregar otras configuraciones si es necesario
  };

  // Si el accessToken está disponible como propiedad, lo asignamos a la configuración global
  config.accessToken = karate.properties['accessToken'] || null; // Establece un valor predeterminado
  config.clientName = karate.properties['clientName'] || null;
  config.clientEmail = karate.properties['clientEmail'] || null;
  config.orderId = karate.properties['orderId'] || null;

  return config;
}