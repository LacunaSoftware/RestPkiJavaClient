

# PadesSignaturePostRequestV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pdfToSign** | [**FileModel**](FileModel.md) |  |  |
|**visualRepresentation** | [**PadesVisualRepresentationModel**](PadesVisualRepresentationModel.md) |  |  [optional] |
|**pdfMarks** | [**List&lt;PdfMarkModel&gt;**](PdfMarkModel.md) |  |  [optional] |
|**bypassMarksIfSigned** | **Boolean** |  |  [optional] |
|**measurementUnits** | **PadesMeasurementUnits** |  |  [optional] |
|**pageOptimization** | [**PadesPageOptimizationModel**](PadesPageOptimizationModel.md) |  |  [optional] |
|**customSignatureFieldName** | **String** |  |  [optional] |
|**certificationLevel** | **PadesCertificationLevel** |  |  [optional] |
|**reason** | **String** |  |  [optional] |
|**certificate** | **byte[]** |  |  [optional] |
|**signaturePolicyId** | **UUID** |  |  [optional] |
|**securityContextId** | **UUID** |  |  [optional] |
|**callbackArgument** | **String** |  |  [optional] |
|**ignoreRevocationStatusUnknown** | **Boolean** |  |  [optional] |



