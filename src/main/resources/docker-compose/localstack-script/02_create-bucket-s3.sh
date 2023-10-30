#!/bin/bash

echo "########### Creating Bucket ###########"
awslocal s3api create-bucket \
--bucket s3bucket \
--create-bucket-configuration LocationConstraint=sa-east-1

echo "########### Creating Folder 'loc' ###########"
awslocal s3api put-object \
--bucket s3bucket \
--key loc/

echo "########### Insert file ###########"
awslocal s3 cp /tmp/localstack/bucket/csu-bs2.txt s3://s3bucket/loc/csu-bs2.txt
awslocal s3 cp /tmp/localstack/bucket/itau-bs1.csv s3://s3bucket/loc/itau-bs1.csv

echo "########### Listing Objects ###########"
awslocal s3api list-objects \
--bucket s3bucket
