# Variables for the following openapi command, change them as needed
$RestPkiCoreSwaggerUrl = "https://core.pki.rest/swagger/api/swagger.json"
$configFilePath = ".\java-openapi-config.json"
$manualFilesPath = ".\manually_generated_files\"
$outDist = ".\dist"
$javaSrcFilesFolder = ".\dist\src\main\java\com\lacunasoftware\client"
$generationLogFile = ".\generation_log.txt"

# Always delete the previous log of generation
Get-Item $generationLogFile | Remove-Item -Force

# Delete all files and subfolders in the directory in order to create new ones
Get-ChildItem -Path $outDist | Remove-Item -Recurse -Force

# Use OpenAPI generator to validate the swagger model then generate the lib from it
openapi-generator-cli validate -i $RestPkiCoreSwaggerUrl --recommend
openapi-generator-cli generate -g java --enable-post-process-file --log-to-stderr -i $RestPkiCoreSwaggerUrl -c $configFilePath -o $outDist --verbose >> $generationLogFile

# Manually generated files section
# ApiClient
# Append the filename to the directory path and replace the existing Java file with the new one
$sourceFilePath = Join-Path -Path $manualFilesPath -ChildPath "ApiClient.java"
$destinationFilePath = Join-Path -Path $javaSrcFilesFolder -ChildPath "ApiClient.java"
Copy-Item -Path $sourceFilePath -Destination $destinationFilePath -Force

# RestPkiClient
# Append the filename to the directory path and replace the existing Java file with the new one
$sourceFilePath = Join-Path -Path $manualFilesPath -ChildPath "RestPkiClient.java"
$destinationFilePath = Join-Path -Path $javaSrcFilesFolder -ChildPath "RestPkiClient.java"
Copy-Item -Path $sourceFilePath -Destination $destinationFilePath -Force

# build.gradle
$sourceFilePath = Join-Path -Path $manualFilesPath -ChildPath "build.gradle"
Copy-Item -Path $sourceFilePath -Destination $outDist -Force

# gradle.properties
$sourceFilePath = Join-Path -Path $manualFilesPath -ChildPath "gradle.properties"
Copy-Item -Path $sourceFilePath -Destination $outDist -Force

# End manually generated files section