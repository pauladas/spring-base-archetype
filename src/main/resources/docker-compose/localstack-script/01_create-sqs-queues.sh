#!/bin/bash
echo "########### Creating Source queue ###########"
awslocal sqs create-queue --queue-name SQS-Name-loc

echo "########### Listing queues ###########"
awslocal sqs list-queues

echo "########### Command to view SQS messages ###########"
echo "awslocal sqs receive-message --queue-url http://localhost:4566/000000000000/SQS-Name-loc"
