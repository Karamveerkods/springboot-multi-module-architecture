# springboot-multi-module-architecture
The project containe springboot multi-module architecture demo. As we all know creating Springboot project through springboot-initializer follows traditional structure. But what if we are working on a big module in some scenerios that traditional structure would end up with a lot of fuzzyness and redundent code. Here the multimodule approach comes into picture. In the module I have seperated the whole project into 4 modules( repository, service, controller, domain ) under a parent module.

|******************************************************************************************************************************
|  |***********************************************************************************************************************|
|  |                                               Parent Module                                                           | 
|  |_______________________________________________________________________________________________________________________|
|
|  |**************|      |************|       |***************|   |*************|     Main key to have common artifect-id     
|  |  Repository  |      |  Service   |       |   Controller  |   |    domain   |     i.e. for example in the above code its 
|  |______________|      |____________|       |_______________|   |_____________|     "com.karamveer". Plus using 
|                                                                                      @ComponentScan                    
|  
*****************************************************************************************************************************

Repositry module:  contains interface DoctorReposity extends JpaRepository which deals with storing and retriving data in a inmemory database H2.  
