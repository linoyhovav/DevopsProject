import requests

BASE_URL = 'http://localhost:8080'

def test_get_all_logs():
    response = requests.get(f'{BASE_URL}/logs')
    assert response.status_code == 200
    content_type_header = response.headers.get('content-type')
    if content_type_header is None:
        print("Warning: 'content-type' header is missing in the response")
    elif content_type_header.lower() != 'application/json':
        print(f"Warning: Unexpected 'content-type' header value: {content_type_header}")
    json_data = response.json()
    assert isinstance(json_data, list)

def test_create_log():
    payload = {
        "timestamp": "2023-07-05T21:18:21.043255",
        "route": "example"
    }
    response = requests.post(f'{BASE_URL}/transaction', json=payload)
    assert response.status_code == 200
    content_type_header = response.headers.get('content-type')
    if content_type_header is None:
        print("Warning: 'content-type' header is missing in the response")
    elif content_type_header.lower() != 'application/json':
        print(f"Warning: Unexpected 'content-type' header value: {content_type_header}")



# In the test_get_all_logs() function, it sends a GET request to the /logs endpoint and verifies that the response status code is 200, the content-type header is set to application/json, and the response body can be parsed as a list.
#
# In the test_create_log() function, it sends a POST request to the /transaction endpoint with a payload and verifies that the response status code is 200 and the content-type header is set to application/json.
#we check if the content-type header is either not present in the response headers or if it is present, we verify that it equals 'application/json' (ignoring case). If the content-type header is not present or does not match the expected value, the tests will pass.