import { HttpClient } from "@angular/common/http";
import { BACKEND_APIS } from "../util/backend-apis";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root"
})
export class RelationService {
  private baseUrl = BACKEND_APIS.relationApi;

  constructor(private httpClient: HttpClient) {
  }

  public createRelation(crewMemberId: number, flightId: number): Observable<void> {
    return this.httpClient.post<void>(`${this.baseUrl}/${crewMemberId}/flights`, flightId)
  }

  public deleteRelation(crewMemberId: number, flightId: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/${crewMemberId}/flights/${flightId}`)
  }
}
