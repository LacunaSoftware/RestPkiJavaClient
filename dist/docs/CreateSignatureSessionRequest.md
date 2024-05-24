

# CreateSignatureSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**returnUrl** | **String** |  |  [optional] |
|**securityContextId** | **UUID** |  |  [optional] |
|**callbackArgument** | **String** |  |  [optional] |
|**enableBackgroundProcessing** | **Boolean** |  |  [optional] |
|**disableDownloads** | **Boolean** |  |  [optional] |
|**documentMetadata** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [optional] |
|**documents** | [**List&lt;SignatureSessionDocumentData&gt;**](SignatureSessionDocumentData.md) |  |  [optional] |
|**certificateRequirements** | [**List&lt;CertificateRequirement&gt;**](CertificateRequirement.md) |  |  [optional] |
|**pdfSignatureOptions** | [**PdfSignatureOptions**](PdfSignatureOptions.md) |  |  [optional] |
|**cmsSignatureOptions** | [**CmsSignatureOptions**](CmsSignatureOptions.md) |  |  [optional] |



