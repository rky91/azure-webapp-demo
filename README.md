# Azure webapp

	- Add the below azure plugin
		<!-- Azure webapp plugin -->
		<plugin> 
	        <groupId>com.microsoft.azure</groupId>  
	        <artifactId>azure-webapp-maven-plugin</artifactId>  
	        <version>1.8.0</version>
	    </plugin
	    <!-- Ends -->
	    
	- Run the below command to configure the webapp plugin
		-- mvn clean install azure-webapp:config
    - After that set the details like resource group name, app name, region, pricing Tier etc in pom.xml
    - Then run the below command to deploy the app to Azure.
    	-- mvn clean install azure-webapp:deploy