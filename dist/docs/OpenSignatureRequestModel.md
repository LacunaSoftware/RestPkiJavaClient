

# OpenSignatureRequestModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_file** | [**FileModel**](FileModel.md) |  |  |
|**validate** | **Boolean** |  |  [optional] |
|**auditPackage** | [**AuditPackageOptions**](AuditPackageOptions.md) |  |  [optional] |
|**defaultSignaturePolicyId** | **UUID** |  |  [optional] |
|**acceptableExplicitPolicies** | **List&lt;UUID&gt;** |  |  [optional] |
|**securityContextId** | **UUID** |  |  [optional] |
|**ignoreRevocationStatusUnknown** | **Boolean** |  |  [optional] |
|**trustUncertifiedSigningTime** | **Boolean** |  |  [optional] |
|**dataHashes** | [**List&lt;DigestAlgorithmAndValueModel&gt;**](DigestAlgorithmAndValueModel.md) |  |  [optional] |



