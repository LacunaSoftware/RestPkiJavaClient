

# CadesSignaturePostRequestV3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataHashes** | [**List&lt;DigestAlgorithmAndValueModel&gt;**](DigestAlgorithmAndValueModel.md) |  |  [optional] |
|**fileToSign** | [**FileModel**](FileModel.md) |  |  [optional] |
|**cmsToCoSign** | [**FileModel**](FileModel.md) |  |  [optional] |
|**encapsulateContent** | **Boolean** |  |  [optional] |
|**certificate** | **byte[]** |  |  [optional] |
|**signaturePolicyId** | **UUID** |  |  [optional] |
|**securityContextId** | **UUID** |  |  [optional] |
|**callbackArgument** | **String** |  |  [optional] |
|**ignoreRevocationStatusUnknown** | **Boolean** |  |  [optional] |



